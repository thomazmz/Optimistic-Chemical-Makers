package com.OptimisticChemicalMakers.MapFood.dtos;

public class StoreDto {

    private Long id;

    private Long latitude;

    private Long longitude;

    private String name;

    private String dishDescription;

    private String city;

    public StoreDto() {

    }

    public StoreDto(Long latitude, Long longitude, String name, String dishDescription, String city) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.dishDescription = dishDescription;
        this.city = city;
    }

    // Getters

    public Long getId() {
        return id;
    }

    public Long getLatitude() {
        return latitude;
    }

    public Long getLongitude() {
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Long longitude) {
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
}
