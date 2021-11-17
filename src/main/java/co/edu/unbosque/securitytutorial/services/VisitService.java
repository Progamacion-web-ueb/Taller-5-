package co.edu.unbosque.securitytutorial.services;



import co.edu.unbosque.securitytutorial.jpa.entities.Visit;
import co.edu.unbosque.securitytutorial.jpa.repositories.VisitRepositoryImpl;
import co.edu.unbosque.securitytutorial.jpa.repositories.VisitRepository;
import co.edu.unbosque.securitytutorial.resources.pojos.VisitPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

@Stateless
public class VisitService {

    VisitRepository visitRepository;

    public Optional<VisitPOJO> createVisit(VisitPOJO visitPOJO) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        visitRepository = new VisitRepositoryImpl(entityManager);

        Visit visit = new Visit(visitPOJO.getVisit_id(),visitPOJO.getCreated_at(),visitPOJO.getType(),
                visitPOJO.getDescription(),visitPOJO.getPet_id(),visitPOJO.getVet_id());

        Optional<Visit> persistedVisit = visitRepository.save(visit);

        entityManager.close();
        entityManagerFactory.close();

        if (persistedVisit.isPresent()) {
            return Optional.of(new VisitPOJO(
                    persistedVisit.get().getVisit_id(),
                    persistedVisit.get().getCreated_at(),
                    persistedVisit.get().getType(),
                    persistedVisit.get().getDescription(),
                    persistedVisit.get().getPet(),
                    persistedVisit.get().getVet()));
        } else {
            return Optional.empty();
        }

    }

}
