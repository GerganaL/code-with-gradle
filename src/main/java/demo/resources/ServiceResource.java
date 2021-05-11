package demo.resources;

import demo.entities.Event;
import demo.entities.Service;
import demo.service.EventService;
import demo.service.ServiceService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/service")
@Produces(value = MediaType.APPLICATION_JSON)
@Consumes(value = MediaType.APPLICATION_JSON)
public class ServiceResource {

    @Inject
    EventService events;
    @Inject
    ServiceService services;


    @GET
    @Path("/listAllServices")
    public List<Service> listServices() {
        return services.getAllServices();
    }

    @GET
    @Path("/getCount")
    public long countServices() {
        return services.getServiceCount();
    }

    @GET
    @Path("/getById/{id}")
    public Service getServiceById(@PathParam Long id){
        return  services.getServiceById(id);
    }

    @POST
    @Transactional
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Path("/addService")
    public Service addService(Service service) throws Exception {
        services.addService(service);
        return service;
    }

    @DELETE
    @Transactional
    @Path("/deleteService")
    public boolean deleteService(@PathParam Long id) {
        return services.deleteService(id);
    }

}
