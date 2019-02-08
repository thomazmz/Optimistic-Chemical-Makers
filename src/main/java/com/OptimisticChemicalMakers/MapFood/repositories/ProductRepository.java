package com.OptimisticChemicalMakers.MapFood.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.OptimisticChemicalMakers.MapFood.models.Product;
import com.OptimisticChemicalMakers.MapFood.models.Store;

public interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findByStore(Store store);

}