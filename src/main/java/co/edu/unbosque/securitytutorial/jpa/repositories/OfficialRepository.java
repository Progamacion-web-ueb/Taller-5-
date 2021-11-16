package co.edu.unbosque.securitytutorial.jpa.repositories;

import co.edu.unbosque.securitytutorial.jpa.entities.Official;


import java.util.Optional;

public interface OfficialRepository {
    Optional<Official> save(Official official);
}
