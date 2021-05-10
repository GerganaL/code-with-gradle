package demo.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "events")
public class Event extends PanacheEntityBase {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private LocalDateTime startTime = LocalDateTime.now();
     private LocalDateTime endTime = LocalDateTime.now();
     private  String status;
     private String type;
     private String title;
     private String clientName;
     private int guestsCount;
     private String freeText;
     @ManyToMany(mappedBy = "events")
     private Set<Service> service = new HashSet<>();

     public Event(){
     }

     public Event(String status, String type, String title, String clientName, int guestsCount, String freeText, Set<Service> service) {
          this.status = status;
          this.type = type;
          this.title = title;
          this.clientName = clientName;
          this.guestsCount = guestsCount;
          this.freeText = freeText;
          this.service = service;
     }

     public Event(Long id, LocalDateTime startTime, LocalDateTime endTime, String status, String type, String title, String clientName, int guestsCount, String freeText, Set<Service> service) {
          this.id = id;
          this.startTime = startTime;
          this.endTime = endTime;
          this.status = status;
          this.type = type;
          this.title = title;
          this.clientName = clientName;
          this.guestsCount = guestsCount;
          this.freeText = freeText;
          this.service = service;
     }

     public LocalDateTime getStartTime() {
          return startTime;
     }

     public void setStartTime(LocalDateTime startTime) {
          this.startTime = startTime;
     }

     public LocalDateTime getEndTime() {
          return endTime;
     }

     public void setEndTime(LocalDateTime endTime) {
          this.endTime = endTime;
     }

     public String getStatus() {
          return status;
     }

     public void setStatus(String status) {
          this.status = status;
     }

     public String getType() {
          return type;
     }

     public void setType(String type) {
          this.type = type;
     }

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public String getClientName() {
          return clientName;
     }

     public void setClientName(String clientName) {
          this.clientName = clientName;
     }

     public int getGuestsCount() {
          return guestsCount;
     }

     public void setGuestsCount(int guestsCount) {
          this.guestsCount = guestsCount;
     }

     public String getFreeText() {
          return freeText;
     }

     public void setFreeText(String freeText) {
          this.freeText = freeText;
     }

     public Set<Service> getService() {
          return service;
     }

     public void setService(Set<Service> service) {
          this.service = service;
     }


     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Event event = (Event) o;
          return id.equals(event.id);
     }

     @Override
     public int hashCode() {
          return Objects.hash(id);
     }

     @Override
     public String toString() {
          return "Event{" +
                  "id=" + id +
                  ", startTime=" + startTime +
                  ", endTime=" + endTime +
                  ", status='" + status + '\'' +
                  ", type='" + type + '\'' +
                  ", title='" + title + '\'' +
                  ", clientName='" + clientName + '\'' +
                  ", guestsCount=" + guestsCount +
                  ", freeText='" + freeText + '\'' +
                  ", service=" +
                  '}';
     }
}
