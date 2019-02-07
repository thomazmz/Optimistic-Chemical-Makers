package com.OptimisticChemicalMakers.MapFood.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OptimisticChemicalMakers.MapFood.Services.ProductService;
import com.OptimisticChemicalMakers.MapFood.dtos.ProductDto;

@CrossOrigin(origins="http://localhost:4200") // Temporary for the Angular App test
@RestController
@RequestMapping(value = "/api")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/productByStore/{hashRestaurant}")
    public List<ProductDto> getProductByStore(@PathVariable String hashRestaurant) {
		return productService.getByHashRestaurant(hashRestaurant);
    }
}
