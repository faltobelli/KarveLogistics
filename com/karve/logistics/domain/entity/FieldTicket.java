package com.karve.logistics.domain.entity;

import com.sun.javafx.beans.IDProperty;
//import org.hibernate.annotations.Table;

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

    private Date estDileveryTime;

    private Date actualDileveryTime;

    private GPSPos gpsPos;

    private String product;

    // TODO: Use many to one relation with CLIENT entity
    private String client;
    private String siteContact;
    private String receptionType;
    private String siteAddress;

    private String price;

    // TODO: Use many to one relation with ServiceType entity
    private String serviceType;
}
