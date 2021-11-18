package co.edu.unbosque.securitytutorial.jpa.repositories;

import co.edu.unbosque.securitytutorial.jpa.entities.Pet;
import co.edu.unbosque.securitytutorial.jpa.entities.Vet;

import java.util.Optional;

public interface VetRepository {

    Optional<Vet> save(Vet vet);

    Vet findByVet_id(String Username);
}
