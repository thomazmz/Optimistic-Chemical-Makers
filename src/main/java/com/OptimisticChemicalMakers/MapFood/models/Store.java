package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Store extends Geolocation implements Serializable {

	private static final long serialVersionUID = 1L;

	// Properties

	@Id // It tells the JPA that it is an ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // It tells the JPA how to autogenerate the ID value
	private Long id;

	private String hash;

	private String name;

	private String dishDescription;

	private String city;

	@OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
	private Set<Product> products;

	@OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
	private Set<DeliveryOrder> deliveryOrders;

	@Transient
	private String distance;

	// Constructors

	public Store() {
	}

	public Store(Float latitude, Float longitude, String name, String dishDescription) {
		super(latitude, longitude);
		this.name = name;
		this.dishDescription = dishDescription;
	}

	public Long getId() {
		return id;
	}
	
	public String getHash() {
		return hash;
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

	public Set<Product> getProducts() {
		return products;
	}

	public Set<DeliveryOrder> getDeliveryOrders() {
		return deliveryOrders;
	}

	public String getDistance() {
		return distance;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setHash(String hash) {
		this.hash = hash;
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

	public void setDeliveryOrders(Set<DeliveryOrder> deliveryOrders) {
		this.deliveryOrders = deliveryOrders;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	// Methods

	public void addDeliveryOrder(DeliveryOrder deliveryOrder) {
		this.deliveryOrders.add(deliveryOrder);
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

}