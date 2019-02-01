package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class DeliveryOrder {

    // Class Properties

    @Id                                                 // It tells the JPA that it is an ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // It tells the JPA how to autogenerate the ID value
    private Long id;

    @ManyToOne
    @JoinColumn(name="store_id", nullable=false)
    private Store store;

    @OneToMany(mappedBy="deliveryOrder", cascade = CascadeType.ALL)
    private Set<DeliveryItem> deliveryItems;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "latitude", column = @Column(name = "ending_latitude")),
            @AttributeOverride(name = "longitude", column = @Column(name = "ending_longitude"))
    })
    private Geolocation endingGeolocation;

    // Constructors

    public DeliveryOrder(){

    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public Store getStore() {
        return this.store;
    }

    public Set<DeliveryItem> getDeliveryItems() {
        return this.deliveryItems;
    }

    public Geolocation getEndingGeolocation() {
        return endingGeolocation;
    }

    // Setters

    public void setEndingGeolocation(double latitude, double longitude) {
        this.endingGeolocation = new Geolocation(latitude, longitude);
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void setDeliveryItems(Set<DeliveryItem> deliveryItems) {
        this.deliveryItems = deliveryItems;
    }


}