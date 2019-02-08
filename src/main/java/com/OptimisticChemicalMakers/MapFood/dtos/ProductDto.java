package com.OptimisticChemicalMakers.MapFood.dtos;

import java.math.BigDecimal;

public class ProductDto {

    // Properties

    private String id;

    private String description;

    private BigDecimal price;

    // Constructor

    public ProductDto() {
    }

    // Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // Getters

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
