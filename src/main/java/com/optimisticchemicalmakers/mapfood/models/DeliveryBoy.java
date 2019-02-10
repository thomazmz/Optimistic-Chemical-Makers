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

    private Double latitude;

    private Double longitude;

    // Constructors

    public DeliveryBoy(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public String getProtocol() { return this.protocol; }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    // Setters

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}

