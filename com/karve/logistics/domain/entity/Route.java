package com.karve.logistics.domain.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="routes")
public class Route implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long routeId;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date estDileveryTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date actualDeleveryTime;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

}
