package co.edu.unbosque.securitytutorial.jpa.repositories;


import co.edu.unbosque.securitytutorial.jpa.entities.PetCase;


import java.util.Optional;

public interface PetCaseRepository {



    Optional<PetCase> save(PetCase petCase);
}
