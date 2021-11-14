package co.edu.unbosque.taller5.resources;

import co.edu.unbosque.taller5.resources.pojos.AuthorPojo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/authors/{id}")
public class AuthorResource {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("id") Integer id, AuthorPojo author) {

        return Response.ok()
                .entity(author)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("id") Integer id) {

        return Response.noContent()
                .build();
    }

}
