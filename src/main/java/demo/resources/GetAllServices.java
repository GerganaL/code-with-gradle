package demo.resources;


import demo.entities.Service;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Path("/api")
@Produces(value = MediaType.APPLICATION_JSON)
public class GetAllServices {

    @GET
    public List<Service> getAll(){
        return Service.listAll();
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createService(Service service){
        service.persist();
        return Response.created(URI.create("1")).build();
    }

}
