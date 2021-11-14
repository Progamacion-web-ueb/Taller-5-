package co.edu.unbosque.taller5.resources.services;

import co.edu.unbosque.taller5.jpa.entities.Author;
import co.edu.unbosque.taller5.jpa.repositories.AuthorRepository;
import co.edu.unbosque.taller5.jpa.repositories.AuthorRepositoryImpl;
import co.edu.unbosque.taller5.resources.pojos.AuthorPojo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class AuthorService {

    AuthorRepository authorRepository;

    public List<AuthorPojo> listAuthors() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        authorRepository = new AuthorRepositoryImpl(entityManager);
        List<Author> authors = authorRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<AuthorPojo> authorsPOJO = new ArrayList<>();
        for (Author author : authors) {
            authorsPOJO.add(new AuthorPojo(
                    author.getAuthorId(),
                    author.getName()
            ));
        }
        return authorsPOJO;
    }

    public Author saveAuthor(String name) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        authorRepository = new AuthorRepositoryImpl(entityManager);

        Author author = new Author(name);
        Author persistedAuthor = authorRepository.save(author).get();

        entityManager.close();
        entityManagerFactory.close();

        return persistedAuthor;

    }

    public void deleteAuthor(Integer authorId) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        authorRepository = new AuthorRepositoryImpl(entityManager);
        authorRepository.deleteById(authorId);

        entityManager.close();
        entityManagerFactory.close();

    }

}
