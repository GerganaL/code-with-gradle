package demo.repositories;

import demo.entities.Event;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class EventRepository implements PanacheRepository<Event> {
}
