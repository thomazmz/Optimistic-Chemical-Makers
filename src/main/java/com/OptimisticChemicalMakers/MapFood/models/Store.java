package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Store implements Serializable {
	
	private static final long serialVersionUID = 1L;

    // Properties

    @Id                                                 // It tells the JPA that it is an ID
    private String id;

    private Long latitude;

    private Long longitude;

    private String name;

    @Column(name = "dish_description")
    private String dishDescription;

    @Column(name = "address_city")
    private String city;
    
    //@Transient
    private String distance;

    // Constructors

    public Store() {}
    
    public Store(Long latitude, Long longitude, String name) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Store(Long latitude, Long longitude, String name, String dishDescription) {
        this.name = name;
        this.dishDescription = dishDescription;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Get Methods

    public String getId() {
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

    public String getDistance() {
		return distance;
	}
    
    // Set Methods

	public void setId(String id) {
		this.id = id;
	}
	
	public void setDistance(String distance) {
		this.distance = distance;
	}

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
