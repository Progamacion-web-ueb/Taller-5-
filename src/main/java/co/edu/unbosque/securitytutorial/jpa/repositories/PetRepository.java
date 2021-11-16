package co.edu.unbosque.securitytutorial.jpa.repositories;

import co.edu.unbosque.securitytutorial.jpa.entities.Pet;

import java.util.Optional;

public interface PetRepository {
    Optional<Pet> findByUsername(String pet_id);

    Optional<Pet> save(Pet pet);
}
