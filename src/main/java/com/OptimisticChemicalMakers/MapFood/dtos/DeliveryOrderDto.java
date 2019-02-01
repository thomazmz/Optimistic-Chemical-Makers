package com.OptimisticChemicalMakers.MapFood.dtos;

import java.util.Set;

public class DeliveryOrderDto {

    private Long id;

    private Long storeId;

    private Double endingLatitude;

    private Double endingLongitude;

    private Set<DeliveryItemDto> deliveryItems;

    // Constructor

    public DeliveryOrderDto() {
    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public Double getEndingLatitude() {
        return this.endingLatitude;
    }

    public Double getEndingLongitude() {
        return this.endingLongitude;
    }

    public Set<DeliveryItemDto> getDeliveryItems() {
        return this.deliveryItems;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setStoreId(Long store_id) {
        this.storeId = store_id;
    }

    public void setEndingLatitude(Double originLatitude) {
        this.endingLatitude = originLatitude;
    }

    public void setEndingLongitude(Double originLongitude) {
        this.endingLongitude = originLongitude;
    }

    public void setDeliveryItems(Set<DeliveryItemDto> deliveryItems) {
        this.deliveryItems = deliveryItems;
    }


}
