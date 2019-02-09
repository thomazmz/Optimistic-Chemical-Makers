package com.optimisticchemicalmakers.mapfood.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Requestor {
	
    // Class Properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(nullable = false)
	private String protocol = UUID.randomUUID().toString().replace("-", "");

	// Constructors

	public Requestor() {}

	// Getters

	public Long getId() {
		return id;
	}

	public String getProtocol() {
		return this.protocol;
	}

}
