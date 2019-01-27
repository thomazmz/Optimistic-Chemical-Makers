package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DeliveryOrder {

    // Class Properties

    @Id                                                 // It tells the JPA that it is an ID
    @GeneratedValue(strategy = GenerationType.AUTO)     // It tells the JPA how to autogenerate the ID value
    private Long id;

    private Date createdAt;

    private Date acceptedAt;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "latitude", column = @Column(name = "origin_latitude")),
            @AttributeOverride(name = "longitude", column = @Column(name = "origin_longitude"))
    })
    private Geolocation originGeolocation;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "latitude", column = @Column(name = "ending_latitude")),
            @AttributeOverride(name = "longitude", column = @Column(name = "ending_longitude"))
    })
    private Geolocation endingGeolocation;

    public DeliveryOrder(Double originLatitude, Double originLongitude, Double endingLatitude, Double endingLongitude) {

        this.originGeolocation = new Geolocation(originLatitude, originLongitude);

        this.endingGeolocation = new Geolocation(endingLatitude, endingLongitude);

        this.createdAt = new Date();

    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public Date getAcceptedAt() {
        return this.acceptedAt;
    }

    public Double getLinearDistance() {
        return this.getOriginGeolocation().distanceTo(this.getEndingGeolocation());
    }

    public Geolocation getOriginGeolocation() {
        return originGeolocation;
    }

    public Geolocation getEndingGeolocation() {
        return endingGeolocation;
    }

    // Setters

    public void setAcceptedAt(Date acceptedAt) {
        this.acceptedAt = acceptedAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}