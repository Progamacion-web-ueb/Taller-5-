package co.edu.unbosque.securitytutorial.resources;

import co.edu.unbosque.securitytutorial.resources.filters.Logged;
import co.edu.unbosque.securitytutorial.resources.pojos.OfficialPOJO;
import co.edu.unbosque.securitytutorial.services.OfficialService;
//import co.edu.unbosque.securitytutorial.services.;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/officials")
public class OfficialResource {


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(OfficialPOJO official) {

        Optional<OfficialPOJO> persisteOfficial = new OfficialService().createOfficial(official);

        if (persisteOfficial.isPresent()) {
            return Response.status(Response.Status.CREATED)
                    .entity(persisteOfficial.get())
                    .build();
        } else {
            return Response.serverError()
                    .entity("Owner user could not be created")
                    .build();
        }

    }

    @Logged
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello(@HeaderParam("role") String role) {
        // If role doesn't match
        if (!"vet".equals(role))
            return Response.status(Response.Status.FORBIDDEN)
                    .entity("Role " + role + " cannot access to this method")
                    .build();

        return Response.ok()
                .entity("Hello, World, " + role + "!")
                .build();
    }
}
