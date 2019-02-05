package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Product  implements Serializable {

	private static final long serialVersionUID = 1L;

    // Properties

    @Id                                                 // It tells the JPA that it is an ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // It tells the JPA how to autogenerate the ID value
    private Long id;
   
    @Column(name="item_description")
    private String description;

    @Column(name="unit_price")
    private BigDecimal price;
    
    private String itemId;
    
    private String classification;
    
    @ManyToOne
    @JoinColumn(name="restaurant_id", nullable=false, referencedColumnName="restaurant_id")
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


	public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    
	public String getItemId() {
		return itemId;
	}

	public String getClassification() {
		return classification;
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

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public void setStore(Store store) {
		this.store = store;
	}
    
}

