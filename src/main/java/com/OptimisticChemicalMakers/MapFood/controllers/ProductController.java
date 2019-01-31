package com.OptimisticChemicalMakers.MapFood.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.OptimisticChemicalMakers.MapFood.models.Product;
import com.OptimisticChemicalMakers.MapFood.repositories.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	//Enable Cross-Origin Resource Sharing
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/productByStore/{restaurant_id}", method = RequestMethod.GET, produces = "application/json")
    public List<Product> getProductByStore(@PathVariable String restaurant_id) {
        return productRepository.getByRestaurantId(restaurant_id);
    }
}
