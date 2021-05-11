package demo.repositories;

import demo.entities.Service;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ServiceRepository implements PanacheRepository<Service> {
}
