package co.edu.unbosque.securitytutorial.resources;

import co.edu.unbosque.securitytutorial.resources.filters.Logged;
import co.edu.unbosque.securitytutorial.resources.pojos.PetCasePOJO;
import co.edu.unbosque.securitytutorial.services.PetCaseService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/petCases")
public class PetCaseResource {
// se crea pet pero el idpet queda en null

    @POST
    //@Path("/{}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(PetCasePOJO petCase) {

        Optional<PetCasePOJO> persistedPetCase = new PetCaseService().createPetCase(petCase);

        if (persistedPetCase.isPresent()) {
            return Response.status(Response.Status.CREATED)
                    .entity(persistedPetCase.get())
                    .build();
        } else {
            return Response.serverError()
                    .entity("PetCase could not be created")
                    .build();
        }
    }
}
