package com.optimisticchemicalmakers.mapfood.models;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(nullable = false)
    private String uuid = UUID.randomUUID().toString().replace("-", "");

	@OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
	private Set<Product> products;

	private String name;

	public Store(){
	}

	public Store(String name) {
		this.name = name;
	}

}
