package com.optimisticchemicalmakers.mapfood.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Customer {
	
    // Class Properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(nullable = false)
	private String protocol = UUID.randomUUID().toString().replace("-", "");
    
	public Customer() {}

	public Customer(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
    

}
