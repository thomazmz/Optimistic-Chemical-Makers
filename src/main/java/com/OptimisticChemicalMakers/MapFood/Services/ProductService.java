package com.OptimisticChemicalMakers.MapFood.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.OptimisticChemicalMakers.MapFood.dtos.ProductDto;
import com.OptimisticChemicalMakers.MapFood.factories.ProductFactory;
import com.OptimisticChemicalMakers.MapFood.models.Store;
import com.OptimisticChemicalMakers.MapFood.repositories.ProductRepository;

@CrossOrigin(origins="http://localhost:4200") // Temporary for the Angular App test
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Factories

    @Autowired
    private ProductFactory productFactory;
    
    public List<ProductDto> getByHashRestaurant(String hash) {
    	Store store = new Store();
    	store.setHash(hash);
    	
    	return productRepository
    			.findByStore(store)
				.stream()
				.map(productFactory::getInstance)
				.collect(Collectors.toList());
	}
    
}
