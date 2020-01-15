package com.optimisticchemicalmakers.mapfood.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity(name = "Store")
@Table(name = "store")
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(nullable = false)
    private String uuid = UUID.randomUUID().toString().replace("-", "");

	@OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
	private Set<Product> products = new HashSet<>();

	private String name;

	public Store(){
	}

	public Store(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getUuid() {
		return uuid;
	}

	public String getName() {
		return name;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}
}
