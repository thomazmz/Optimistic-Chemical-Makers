package com.OptimisticChemicalMakers.MapFood.models;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class DeliveryBoy {

    // Properties

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(columnDefinition = "CHAR(32)")
    private String id;

    private Long latitude;

    private Long longitude;

    // Constructors

    public DeliveryBoy(Long latitude, Long longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters

    public String getId() {
        return this.id;
    }

    public Long getLatitude() {
        return this.latitude;
    }

    public Long getLongitude() {
        return this.longitude;
    }

    // Setters

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

}

