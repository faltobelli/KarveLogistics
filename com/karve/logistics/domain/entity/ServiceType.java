package com.karve.logistics.domain.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="servicetype")
public class ServiceType implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
