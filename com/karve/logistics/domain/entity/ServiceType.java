package com.karve.logistics.domain.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="servicetype")
public class ServiceType implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceTypeId;

    private String name;


    public Long getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
