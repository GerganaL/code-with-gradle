package demo.service;

import demo.entities.Service;

import java.util.List;

public interface ServiceService {
    List<Service> getAllServices();
    Service getServiceById(Long id);
    void addService(Service service);
    void updateService(Service service);
    boolean deleteService(Long id);
    long getServiceCount();


}
