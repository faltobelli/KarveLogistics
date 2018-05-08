package com.karve.logistics.domain.entity;

import javax.persistence.Column;
import java.io.Serializable;

@entity
@table(name="location")
public class LocationModel implements Serializable {

    @id
    @Column(name = "unitId", nullable = false)
    private Long unitId;

}
