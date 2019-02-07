package com.OptimisticChemicalMakers.MapFood.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;

public class StoreDto {

	private Long id;
	
    private String hash;
    
    private Float latitude;

    private Float longitude;

    private String name;

    private String dishDescription;

    private String city;
    
    private String distance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double requestorDistance;

    public StoreDto() {

    }

	public Long getId() {
		return id;
	}

	public String getHash() {
		return hash;
	}

  public Double getLatitude() {
      return latitude;
  }

  public Double getLongitude() {
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

	public Double getRequestorDistance() {
		return requestorDistance;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
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

	public void setCity(String city) {
		this.city = city;
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
