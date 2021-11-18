package co.edu.unbosque.securitytutorial.resources;

import co.edu.unbosque.securitytutorial.jpa.entities.Owner;
import co.edu.unbosque.securitytutorial.resources.filters.Logged;
import co.edu.unbosque.securitytutorial.resources.pojos.OwnerPOJO;
import co.edu.unbosque.securitytutorial.resources.pojos.PetPOJO;
import co.edu.unbosque.securitytutorial.services.OwnerService;
import co.edu.unbosque.securitytutorial.services.PetService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/pets")
public class PetResource {

// se crea pet pero el id queda en null

    @POST
    @Path("/{owner_id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(PetPOJO pet , @PathParam("owner_id") String owner_id) {

        Owner owner = new PetService().findOwner_id(owner_id);
        System.out.println("esteaa es la respuestaaaa   000"+owner_id);
        System.out.println("esteaa es la respuestaaaa   111"+owner.toString());
        pet.setOwner_id(owner);
        System.out.println("esteaa es la respuestaaaa   222"+pet.getOwner_id());
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
