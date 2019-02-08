package com.OptimisticChemicalMakers.MapFood.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;

public class StoreDto {

	private String protocol;

	private Float latitude;

	private Float longitude;

	private String name;

	private String dishDescription;

	private String city;

	private String distance;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double requestorDistance;

	public StoreDto() {}

    public String getProtocol() {
        return this.protocol;
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
    
	public Double getRequestorDistance() {
		return requestorDistance;
	}	

	public Float getLatitude() {
		return latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDishDescription(String dishDescription) {
		this.dishDescription = dishDescription;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public void setRequestorDistance(Double requestorDistance) {
		this.requestorDistance = requestorDistance;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
