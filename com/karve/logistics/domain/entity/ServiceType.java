package com.karve.logistics.domain.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="servicetype")
public class ServiceType implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}
