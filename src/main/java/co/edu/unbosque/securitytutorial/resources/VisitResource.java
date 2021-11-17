package co.edu.unbosque.securitytutorial.resources;

import co.edu.unbosque.securitytutorial.resources.filters.Logged;
import co.edu.unbosque.securitytutorial.resources.pojos.VisitPOJO;
import co.edu.unbosque.securitytutorial.services.VisitService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/visits")
public class VisitResource {
    // se crea pet pero el pet_id  y vet_idqueda en null

    @POST
    //@Path("/{}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(VisitPOJO visit) {

        Optional<VisitPOJO> persistedVisit = new VisitService().createVisit(visit);

        if (persistedVisit.isPresent()) {
            return Response.status(Response.Status.CREATED)
                    .entity(persistedVisit.get())
                    .build();
        } else {
            return Response.serverError()
                    .entity("PetCase could not be created")
                    .build();
        }
    }
}
