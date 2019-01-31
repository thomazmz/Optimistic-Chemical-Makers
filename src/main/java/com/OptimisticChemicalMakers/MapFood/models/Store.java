package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Store {

    // Properties

    @Id                                                     // It tells the JPA that it is an ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // It tells the JPA how to autogenerate the ID value
    private Long id;

    private Long latitude;

    private Long longitude;

    private String name;

    private String dishDescription;

    private String city;

    @OneToMany(mappedBy="store", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Product> products;

    @OneToMany(mappedBy="store", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DeliveryOrder> deliveryOrders;

    // Constructors

    public Store() {
    }

    public Store(Long latitude, Long longitude, String name, String dishDescription) {
        this.name = name;
        this.dishDescription = dishDescription;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Get Methods

    public Long getId() {
        return id;
    }

    public Long getLatitude() {
        return latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public String getCity() {
        return city;
    }

    public Set<Product> getAvailableProducts() {
        return this.products;
    }

    public Set<DeliveryOrder> getDeliveryOrders() {
        return this.deliveryOrders;
    }

    // Set Methods

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Methods

}
