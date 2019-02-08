package com.OptimisticChemicalMakers.MapFood.models;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Product {

    // Properties

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(columnDefinition = "CHAR(32)")
    private String id;

    private String description;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name="store_id", nullable=false)
    private Store store;

    // Constructors

    public Product() {
    }
    
    public Product(Store store, String description, BigDecimal price) {
        this.store = store;
        this.description = description;
        this.price = price;
    }

    // Get Methods

    public String getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public Store getStore() {
        return this.store;
    }

    // Set Methods

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}

