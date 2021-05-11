package demo.resources;

import demo.entities.Event;
import demo.service.EventService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Set;

@Path("/event")
@Produces(value = MediaType.APPLICATION_JSON)
public class EventResource {

    @Inject
    EventService events;


    @GET
    @Path("/listEvents")
    public List<Event> listEvents() {
        return events.getAllEvents();
    }

    @GET
    @Path("/getCount")
    public long countEvents() {
        return events.getEventsCount();
    }

    @GET
    @Path("/getById/{id}")
    public Event getEventById(@PathParam Long id){
      return  events.getEventById(id);
    }

    @POST
    @Transactional
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Path("/addEvents")
    public Event addEvent(Event event) throws Exception {
        events.addEvent(event);
        return event;
    }

    @DELETE
    @Transactional
    @Path("/deleteEvent")
    public boolean deleteEvent(@PathParam Long id) {
        return events.deleteEvent(id);
    }


}

