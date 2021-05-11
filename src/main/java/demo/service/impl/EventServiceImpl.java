package demo.service.impl;

import demo.entities.Event;
import demo.repositories.EventRepository;
import demo.repositories.ServiceRepository;
import demo.service.EventService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class EventServiceImpl implements EventService {
    @Inject
    EventRepository eventRepository;
  //  private final ServiceRepository serviceRepository;

//    public EventServiceImpl(EventRepository eventRepository) {
//        this.eventRepository = eventRepository;
//    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.listAll();
    }

    @Override
    public Event getEventById(Long id) {
        return eventRepository.findById(id);
    }

    @Override
    @Transactional
    public void addEvent(Event event) throws Exception {
        event.setId(null);
        if(event.getService() == null){
            throw  new Exception("The Event must contain service");
        }
         eventRepository.persist(event);
    }

    @Override
    public void updateEvent(Event event) {
        getEventById(event.getId());
        eventRepository.persistAndFlush(event);
    }

    public boolean deleteEvent(Long id) {
        return eventRepository.deleteById(id);
    }

    @Override
    public long getEventsCount() {
        return eventRepository.count();
    }
}
