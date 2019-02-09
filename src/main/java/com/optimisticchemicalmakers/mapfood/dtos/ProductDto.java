package com.optimisticchemicalmakers.mapfood.dtos;

import java.math.BigDecimal;

public class ProductDto {

    // Properties

    private String protocol;

    private String description;

    private BigDecimal price;

    // Constructor

    public ProductDto() {
    }

    // Setters

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // Getters

    public String getProtocol() {
        return this.protocol;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

}
