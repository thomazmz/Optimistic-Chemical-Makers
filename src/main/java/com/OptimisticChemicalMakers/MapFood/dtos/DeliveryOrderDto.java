package com.OptimisticChemicalMakers.MapFood.dtos;

import java.util.Set;

public class DeliveryOrderDto {

    private Long id;

    private String restaurantId;

    private Float endingLatitude;

    private Float endingLongitude;
    
    private Long customerId;

    private Set<DeliveryItemDto> deliveryItems;

    // Constructor

    public DeliveryOrderDto() {
    }

    // Getters

    public Long getId() {
        return this.id;
    }

	public String getRestaurantId() {
		return restaurantId;
	}

	public Float getEndingLatitude() {
        return this.endingLatitude;
    }

    public Float getEndingLongitude() {
        return this.endingLongitude;
    }

    public Set<DeliveryItemDto> getDeliveryItems() {
        return this.deliveryItems;
    }
    
    public Long getCustomerId() {
		return customerId;
	}
    

    // Setters

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public void setId(Long id) {
        this.id = id;
    }

    public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

    public void setEndingLatitude(Float originLatitude) {
        this.endingLatitude = originLatitude;
    }

    public void setEndingLongitude(Float originLongitude) {
        this.endingLongitude = originLongitude;
    }

    public void setDeliveryItems(Set<DeliveryItemDto> deliveryItems) {
        this.deliveryItems = deliveryItems;
    }
}