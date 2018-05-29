package com.karve.logistics.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="location")
public class Location implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "locationid", nullable = false)
    private Long locationid;

    @OneToOne
    @MapsId
    private GPSPos gpsPos;

    private String address;
    private String city;
    private String zip;
    private String state;
    private String phone;
}
