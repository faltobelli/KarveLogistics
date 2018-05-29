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

    public Long getGpsPosId() {
        return gpsPosId;
    }

    public void setGpsPosId(Long gpsPosId) {
        this.gpsPosId = gpsPosId;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }
}
