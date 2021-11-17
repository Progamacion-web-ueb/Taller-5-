package co.edu.unbosque.securitytutorial.resources;

import co.edu.unbosque.securitytutorial.resources.filters.Logged;

import co.edu.unbosque.securitytutorial.resources.pojos.PetPOJO;

import co.edu.unbosque.securitytutorial.services.PetService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/pets")
public class PetResource {

// se crea pet pero el id queda en null

    @POST
    //@Path("/{}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(PetPOJO pet) {
        Optional<PetPOJO> persistedPet = new PetService().createPet(pet);

        if (persistedPet.isPresent()) {
            return Response.status(Response.Status.CREATED)
                    .entity(persistedPet.get())
                    .build();
        } else {
            return Response.serverError()
                    .entity("Pet could not be created")
                    .build();
        }
    }
}
