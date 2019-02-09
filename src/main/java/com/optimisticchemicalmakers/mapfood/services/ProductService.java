package com.optimisticchemicalmakers.mapfood.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.optimisticchemicalmakers.mapfood.models.Product;
import com.optimisticchemicalmakers.mapfood.models.Store;
import com.optimisticchemicalmakers.mapfood.repositories.ProductRepository;

@CrossOrigin(origins="http://localhost:4200") // Temporary for the Angular App test
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getByStoreProtocol(String protocol) {
    	Store store = new Store();
    	store.setProtocol(protocol);
    	
    	return productRepository
    			.findByStore(store);
				
	}
    
}
