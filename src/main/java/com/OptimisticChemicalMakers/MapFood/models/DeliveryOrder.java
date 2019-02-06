package com.OptimisticChemicalMakers.MapFood.models;

import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class DeliveryOrder {

    // Class Properties

    @Id                                                 // It tells the JPA that it is an ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // It tells the JPA how to autogenerate the ID value
    private Long id;

    @ManyToOne
    @JoinColumn(name="restaurant_id", nullable=false)
    private Store store;

    @OneToMany(mappedBy="deliveryOrder", cascade = CascadeType.ALL)
    private Set<DeliveryItem> deliveryItems;
    
    @ManyToOne
    @JoinColumn(name="customer_id", nullable=false)
    private Customer customer;

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
    
    public Customer getCustomer() {
		return customer;
	}

    // Setters

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setEndingGeolocation(Float latitude, Float longitude) {
        this.endingGeolocation = new Geolocation(latitude, longitude);
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void setDeliveryItems(Set<DeliveryItem> deliveryItems) {
        this.deliveryItems = deliveryItems;
    }


}