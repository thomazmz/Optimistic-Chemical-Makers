package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Product {

    // Properties

    @Id                                                 // It tells the JPA that it is an ID
    @GeneratedValue(strategy = GenerationType.AUTO)     // It tells the JPA how to autogenerate the ID value
    private Long id;

    private String description;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name="store_id", nullable=false)
    private Store store;


    // Constructors

    public Product(Store store, String description, BigDecimal price) {
        this.store = store;
        this.description = description;
        this.price = price;
    }

    // Get Methods

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Store getStore() {
        return store;
    }

    // Set Methods

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}

