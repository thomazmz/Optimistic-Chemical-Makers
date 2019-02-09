package com.optimisticchemicalmakers.mapfood.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class DeliveryBoy {

    // Properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String protocol = UUID.randomUUID().toString().replace("-", "");

    private Long latitude;

    private Long longitude;

    // Constructors

    public DeliveryBoy(Long latitude, Long longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters

    public Long getId() {
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

