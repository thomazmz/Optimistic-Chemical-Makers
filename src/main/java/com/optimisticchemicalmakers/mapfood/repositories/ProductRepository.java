package com.optimisticchemicalmakers.mapfood.repositories;

import com.optimisticchemicalmakers.mapfood.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}