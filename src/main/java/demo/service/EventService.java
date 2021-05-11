package demo.service;



import demo.entities.Event;

import java.util.List;

public interface EventService {
    List<Event> getAllEvents();
    Event getEventById(Long id);
    void addEvent(Event event) throws Exception;
    void updateEvent(Event event);
    boolean deleteEvent(Long id);
    long getEventsCount();
}
