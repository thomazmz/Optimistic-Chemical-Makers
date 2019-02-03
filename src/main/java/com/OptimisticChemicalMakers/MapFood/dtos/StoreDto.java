package com.OptimisticChemicalMakers.MapFood.dtos;

public class StoreDto {

    private String restaurantId;
    
    private Float latitude;

    private Float longitude;

    private String name;

    private String dishDescription;

    private String city;
    
    private String distance;

    public StoreDto() {

    }

    // Getters
    
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

    public String getName() {
        return name;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public String getCity() {
        return city;
    }

    // Setters

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public void setName(String name) {
        this.name = name;
    }
    
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
