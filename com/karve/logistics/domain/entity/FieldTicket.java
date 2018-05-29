package com.karve.logistics.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "fieldticket")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class FieldTicket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ticketId;

    private String ticketName;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date estDileveryTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date actualDileveryTime;

    private String product;

    private String price;

    @ManyToOne
    @MapsId
    private Client client;

    @ManyToOne
    @MapsId
    private ServiceType serviceType;

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getEstDileveryTime() {
        return estDileveryTime;
    }

    public void setEstDileveryTime(Date estDileveryTime) {
        this.estDileveryTime = estDileveryTime;
    }

    public Date getActualDileveryTime() {
        return actualDileveryTime;
    }

    public void setActualDileveryTime(Date actualDileveryTime) {
        this.actualDileveryTime = actualDileveryTime;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
