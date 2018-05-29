package com.karve.logistics.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="location")
public class Location implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "unitId", nullable = false)
    private Long unitId;

    @OneToOne
    @MapsId
    private GPSPos gpsPos;

}
