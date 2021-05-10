package demo.resources;

import demo.entities.Event;
import demo.entities.Service;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/events")
@Produces(value = MediaType.APPLICATION_JSON)
public class EventResource {

    private Set<Event> events = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public EventResource(){
        Service service = new Service("demo service","this is a demo", BigDecimal.valueOf(10));
        Set<Service> services = new HashSet<>();
        services.add(service);
        events.add(new Event("status ok","demo type","tile","client name",10,"here is some free text",services));
    }

    @GET
    public Set<Event> listEvents(){
        return events;
    }

    @POST
    @Transactional
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Set<Event> addEvent(Event event){
        events.add(event);
        return events;
    }

}
