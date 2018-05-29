package com.karve.logistics.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="location")
public class Location implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "locationid", nullable = false)
    private Long locationid;

    @OneToOne
    @MapsId
    private GPSPos gpsPos;

    private String address;
    private String city;
    private String zip;
    private String state;
    private String phone;

    public Long getLocationid() {
        return locationid;
    }

    public void setLocationid(Long locationid) {
        this.locationid = locationid;
    }

    public GPSPos getGpsPos() {
        return gpsPos;
    }

    public void setGpsPos(GPSPos gpsPos) {
        this.gpsPos = gpsPos;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
