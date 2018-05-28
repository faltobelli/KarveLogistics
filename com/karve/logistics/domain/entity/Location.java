package com.karve.logistics.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="location")
public class Location implements Serializable {

    @Id
    @Column(name = "unitId", nullable = false)
    private Long unitId;

    @OneToOne
    @JoinColumn(name = "gpsPosId", table = "GPSPos")
    private GPSPos gpsPos;

}
