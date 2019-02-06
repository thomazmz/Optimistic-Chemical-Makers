package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Store implements Serializable {

	private static final long serialVersionUID = 1L;


    // Properties

    @Id                                                     // It tells the JPA that it is an ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // It tells the JPA how to autogenerate the ID value
    private Long id;

    @Column(name="restaurant_id")
    private String restaurantId;
    
    private Float latitude;

    private Float longitude;

    @Column(name="restaurant")
    private String name;

    private String dishDescription;

    @Column(name="address_city")
    private String city;

    @OneToMany(mappedBy="store", cascade = CascadeType.ALL)
    private Set<Product> products;

    @OneToMany(mappedBy="store", cascade = CascadeType.ALL)
    private Set<DeliveryOrder> deliveryOrders;

    @Transient
    private String distance;
    
    // Constructors

    public Store() {
    }

    public Store(Float latitude, Float longitude, String name, String dishDescription) {
        this.name = name;
        this.dishDescription = dishDescription;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Get Methods
    
    public Long getId() {
        return id;
    }

	public String getRestaurantId() {
		return restaurantId;
	}

	public String getDistance() {
		return distance;
	}

	public Float getLatitude() {
        return latitude;
    }
    
    public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
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

    public Set<Product> getProducts() {
		return products;
	}
    
    // Set Methods

	public void setDistance(String distance) {
		this.distance = distance;
	}
	
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
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

    public void setProducts(Set<Product> products) {
		this.products = products;
	}
    
    // Methods

	public void addDeliveryOrder(DeliveryOrder deliveryOrder) {
        this.deliveryOrders.add(deliveryOrder);
    }
	
    public void addProduct(Product product) {
        this.products.add(product);
    }
}
