package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DeliveryOrder {

    // Class Properties

    @Id                                                 // It tells the JPA that it is an ID
    @GeneratedValue(strategy = GenerationType.AUTO)     // It tells the JPA how to autogenerate the ID value
    private Long id;

    @ManyToOne
    @JoinColumn(name="store_id", nullable=false)
    private Store store;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "latitude", column = @Column(name = "ending_latitude")),
            @AttributeOverride(name = "longitude", column = @Column(name = "ending_longitude"))
    })
    private Geolocation endingGeolocation;

    public DeliveryOrder(Store store,  Double endingLatitude, Double endingLongitude) {

        this.store = store;

        this.endingGeolocation = new Geolocation(endingLatitude, endingLongitude);

    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public Store getStore() {
        return this.store;
    }

    public Geolocation getEndingGeolocation() {
        return endingGeolocation;
    }

    // Setters

}