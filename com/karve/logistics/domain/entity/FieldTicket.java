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
    private Date creationDate;

    private Date estDileveryTime;

    private Date actualDileveryTime;

    private String product;

    private String price;

    @ManyToOne
    @MapsId
    private Client client;

    @ManyToOne
    @MapsId
    private ServiceType serviceType;
}
