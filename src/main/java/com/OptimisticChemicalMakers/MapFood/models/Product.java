package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Product {

    // Properties

    @Id                                                 // It tells the JPA that it is an ID
    //@GeneratedValue(strategy = GenerationType.AUTO)     // It tells the JPA how to autogenerate the ID value
    private String id;

    @Column(name = "item_description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal price;

    @Column(name = "restaurant_id")
    private String restaurantId;
    
    private String restaurant;
    
    private String classification;
    
    @Column(name = "address_city")
    private String addressCity;
    
    @Transient
    private Store store;

    // Constructors
    
    public Product() {}

    public Product(Store store, String description, BigDecimal price) {
        this.store = store;
        this.description = description;
        this.price = price;
    }

    // Get Methods

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Store getStore() {
        return store;
    }
    
    public String getRestaurantId() {
		return restaurantId;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public String getClassification() {
		return classification;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setStore(Store store) {
		this.store = store;
	}

    // Set Methods
    
    public void setId(String id) {
    	this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

}

