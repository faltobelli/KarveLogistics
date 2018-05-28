package com.karve.logistics.domain.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "fieldticket")
public class FieldTicket implements Serializable {

    @Id
    private Long ticketId;

    private String ticketName;

    @CreatedDate
    private Date creationDate;

    private Date estDileveryTime;

    private Date actualDileveryTime;

    private GPSPos gpsPos;

    private String product;

    private Location clientLocation;

    private String price;

    // TODO: Use many to one relation with ServiceType entity
    private String serviceType;
}
