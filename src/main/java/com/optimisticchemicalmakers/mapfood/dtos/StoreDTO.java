package com.optimisticchemicalmakers.mapfood.dtos;

import java.util.Set;

public class StoreDTO {

    private Long id;

    private String uuid;

    private String name;

    private Set<Long> products;

    public Long getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public Set<Long> getProducts() {
        return products;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(Set<Long> products) {
        this.products = products;
    }
}
