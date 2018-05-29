package com.karve.logistics.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "gpspos")
public class GPSPos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gpsPosId;

    private Long latitude;

    private Long longitude;

}
