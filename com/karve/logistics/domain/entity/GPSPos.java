package com.karve.logistics.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "gpspos")
public class GPSPos implements Serializable {

    @Id
    private Long gpsPosId;

    private Long latitude;

    private Long longitude;

}
