package com.optimisticchemicalmakers.mapfood.models;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import javax.persistence.*;

@Entity
public class DeliveryOrder extends Geolocation {

	// Class Properties

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String protocol = UUID.randomUUID().toString().replace("-", "");

	private Date createdAt;

	private Date acceptedAt;

	private Date preparedAt;

	private Date estimatedDevliveryTime;

	@ManyToOne
	@JoinColumn(name = "store_id", nullable = false)
	private Store store;

	@OneToMany(mappedBy = "deliveryOrder", cascade = CascadeType.ALL)
	private Set<DeliveryItem> deliveryItems;

    @ManyToOne
    @JoinColumn(name="delivery_route_id", nullable=false)
    private DeliveryRoute deliveryRoute;
    
	@ManyToOne
	@JoinColumn(name = "requestor_id", nullable = false)
	private Requestor requestor;

	// Constructors

	public DeliveryOrder() {

	}

	public Long getId() {
		return id;
	}

	public String getProtocol() { return protocol; }

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getAcceptedAt() {
		return acceptedAt;
	}

	public Date getPreparedAt() {
		return preparedAt;
	}

	public Date getEstimatedDevliveryTime() {
		return estimatedDevliveryTime;
	}

	public Store getStore() {
		return store;
	}

	public Set<DeliveryItem> getDeliveryItems() {
		return deliveryItems;
	}

	public Requestor getRequestor() {
		return this.requestor;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setAcceptedAt(Date acceptedAt) {
		this.acceptedAt = acceptedAt;
	}

	public void setPreparedAt(Date preparedAt) {
		this.preparedAt = preparedAt;
	}

	public void setEstimatedDevliveryTime(Date estimatedDevliveryTime) {
		this.estimatedDevliveryTime = estimatedDevliveryTime;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public void setDeliveryItems(Set<DeliveryItem> deliveryItems) {
		this.deliveryItems = deliveryItems;
	}

	public void setRequestor(Requestor requestor) {
		this.requestor = requestor;
	}
	
	public void start() {
		this.createdAt = new Date();
	}
}