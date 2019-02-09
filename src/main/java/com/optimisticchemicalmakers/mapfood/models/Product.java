package com.optimisticchemicalmakers.mapfood.models;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Product  implements Serializable {

	private static final long serialVersionUID = 1L;

    // Properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    @Column(nullable = false)
    private String protocol = UUID.randomUUID().toString().replace("-", "");
    
    private String description;

    private BigDecimal price;

    private String classification;
    
    @ManyToOne
    @JoinColumn(name="store_id", nullable=false, referencedColumnName="id")
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

	public BigDecimal getPrice() {
		return price;
	}

	public String getProtocol() {
		return protocol;
	}

	public String getClassification() {
		return classification;
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

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public void setStore(Store store) {
		this.store = store;
	}

}
