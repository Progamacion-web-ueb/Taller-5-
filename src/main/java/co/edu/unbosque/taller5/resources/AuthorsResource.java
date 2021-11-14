package co.edu.unbosque.taller5.resources;

import co.edu.unbosque.taller5.resources.pojos.AuthorPojo;
import co.edu.unbosque.taller5.resources.services.AuthorService;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.List;

@Path("/authors")
public class AuthorsResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {

        List<AuthorPojo> authors = new ArrayList<AuthorPojo>();
        authors.add(new AuthorPojo(1, "Gabriel Garcia Marquez"));
        authors.add(new AuthorPojo(2, "Jorge Isaacs"));
        authors.add(new AuthorPojo(3, "Paco Jones"));
        authors.add(new AuthorPojo(4, "torre jones"));

        return Response.ok()
                .entity(authors)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(AuthorPojo author) {

        AuthorService authorService = new AuthorService();
        authorService.saveAuthor(author.getName());

        return Response.status(Response.Status.CREATED)
                .entity(author)
                .build();
    }

}
