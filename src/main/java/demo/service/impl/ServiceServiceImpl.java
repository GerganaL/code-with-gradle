package demo.service.impl;

import demo.entities.Service;
import demo.repositories.EventRepository;
import demo.repositories.ServiceRepository;
import demo.service.ServiceService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import java.util.List;

@ApplicationScoped
public class ServiceServiceImpl implements ServiceService {

    @Inject
    private  EventRepository eventRepository;
    @Inject
    private  ServiceRepository serviceRepository;

//    @Inject
//    public ServiceServiceImpl(EventRepository eventRepository, ServiceRepository serviceRepository) {
//        this.eventRepository = eventRepository;
//        this.serviceRepository = serviceRepository;
//    }

    @Override
    public List<Service> getAllServices() {
        return serviceRepository.listAll();
    }

    @Override
    public Service getServiceById(Long id) {
      return   serviceRepository.findById(id);
    }

    @Override
    public void addService(Service service) {
        serviceRepository.persist(service);
    }

    @Override
    public void updateService(Service service) {
        getServiceById(service.getId());
        serviceRepository.persist(service);
    }

    @Override
    public boolean deleteService(Long id) {
        return serviceRepository.deleteById(id);
    }

    @Override
    public long getServiceCount() {
        return serviceRepository.count();
    }
}
