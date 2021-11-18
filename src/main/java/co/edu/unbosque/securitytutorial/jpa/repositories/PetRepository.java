package co.edu.unbosque.securitytutorial.jpa.repositories;

import co.edu.unbosque.securitytutorial.jpa.entities.Owner;
import co.edu.unbosque.securitytutorial.jpa.entities.Pet;

import java.util.Optional;

public interface PetRepository {

    Optional<Pet> save(Pet pet);

    Pet findByPet_id(String Pet_id);
}
