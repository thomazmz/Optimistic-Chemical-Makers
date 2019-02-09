package com.optimisticchemicalmakers.mapfood.models;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Store extends Geolocation implements Serializable {

	private static final long serialVersionUID = 1L;

	// Properties

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(nullable = false)
    private String protocol = UUID.randomUUID().toString().replace("-", "");

	@OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
	private Set<Product> products;

	@OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
	private Set<DeliveryOrder> deliveryOrders;

	private String name;

	private String dishDescription;

	private String city;

	// Constructors

	public Store() {
	}
    
	public Store(Float latitude, Float longitude, String name, String dishDescription) {
		super(latitude, longitude);
		this.name = name;
		this.dishDescription = dishDescription;
	}

	// Getters

    public String getProtocol() {
        return this.protocol;
    }

    public String getName() {
        return this.name;
    }

	public Long getId() {
		return this.id;
	}

 	public String getProcotol() {
		return this.protocol;
	}

	public String getDishDescription() {
		return this.dishDescription;
	}

	public String getCity() {
		return this.city;
	}

	public Set<Product> getProducts() {
		return this.products;
	}

	public Set<DeliveryOrder> getDeliveryOrders() {
		return this.deliveryOrders;
	}

	// Setters

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

	public void setDeliveryOrders(Set<DeliveryOrder> deliveryOrders) {
		this.deliveryOrders = deliveryOrders;
	}

	// Methods
	
	public void addDeliveryOrder(DeliveryOrder deliveryOrder) {
		this.deliveryOrders.add(deliveryOrder);
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

}
