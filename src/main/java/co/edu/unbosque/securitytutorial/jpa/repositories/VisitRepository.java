package co.edu.unbosque.securitytutorial.jpa.repositories;

import co.edu.unbosque.securitytutorial.jpa.entities.Visit;

import java.util.Optional;

public interface VisitRepository {
    Optional<Visit> save(Visit visit);

}
