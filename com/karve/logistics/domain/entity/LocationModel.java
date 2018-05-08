package com.karve.logistics.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="location")
public class LocationModel implements Serializable {

    @Id
    @Column(name = "unitId", nullable = false)
    private Long unitId;

}
