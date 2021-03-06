package com.karve.logistics.domain.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "fieldticket")
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
    private Date actualDeleveryTime;

    private String product;

    private String price;

    private String siteInstructions;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

/*
    @ManyToOne
    @JoinColumn(name = "id")
    private ServiceType serviceType;
*/

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

    public Date getActualDeleveryTime() {
        return actualDeleveryTime;
    }

    public void setActualDeleveryTime(Date actualDeleveryTime) {
        this.actualDeleveryTime = actualDeleveryTime;
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

    public String getSiteInstructions() {
        return siteInstructions;
    }

    public void setSiteInstructions(String siteInstructions) {
        this.siteInstructions = siteInstructions;
    }

    /*
    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
*/

}
