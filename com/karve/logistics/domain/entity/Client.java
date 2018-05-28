package com.karve.logistics.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "client")
public class Client implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private Location location;

}
