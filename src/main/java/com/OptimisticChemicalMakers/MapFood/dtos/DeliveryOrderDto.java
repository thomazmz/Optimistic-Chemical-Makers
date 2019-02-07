package com.OptimisticChemicalMakers.MapFood.dtos;

import java.util.Date;
import java.util.Set;

public class DeliveryOrderDto {

    private Long id;

    private String hashRestaurant;

    private Float endingLatitude;

    private Float endingLongitude;
    
    private Long customerId;
    
    private Date estimatedDevliveryTime;

    private Set<DeliveryItemDto> deliveryItems;

    // Constructor

    public DeliveryOrderDto() {}

	public Long getId() {
		return id;
	}

	public String getHashRestaurant() {
		return hashRestaurant;
	}

	public Float getEndingLatitude() {
		return endingLatitude;
	}

	public Float getEndingLongitude() {
		return endingLongitude;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public Date getEstimatedDevliveryTime() {
		return estimatedDevliveryTime;
	}

	public Set<DeliveryItemDto> getDeliveryItems() {
		return deliveryItems;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setHashRestaurant(String hashRestaurant) {
		this.hashRestaurant = hashRestaurant;
	}

	public void setEndingLatitude(Float endingLatitude) {
		this.endingLatitude = endingLatitude;
	}

	public void setEndingLongitude(Float endingLongitude) {
		this.endingLongitude = endingLongitude;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public void setEstimatedDevliveryTime(Date estimatedDevliveryTime) {
		this.estimatedDevliveryTime = estimatedDevliveryTime;
	}

	public void setDeliveryItems(Set<DeliveryItemDto> deliveryItems) {
		this.deliveryItems = deliveryItems;
	}
   
}