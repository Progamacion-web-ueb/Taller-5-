package co.edu.unbosque.taller5.jpa.repositories;

import co.edu.unbosque.taller5.jpa.entities.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository {

    Optional<Author> findById(Integer id);

    List<Author> findAll();

    Optional<Author> save(Author author);

    void deleteById(Integer id);

}
