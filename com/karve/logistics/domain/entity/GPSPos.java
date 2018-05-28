package com.karve.logistics.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "fieldticket")
public class GPSPos implements Serializable {

    @Id
    private Long gpsPosId;

    private Long latitude;

    private Long longitude;

    @
    private Date;

}
