package com.optimisticchemicalmakers.mapfood.services;

import com.optimisticchemicalmakers.mapfood.models.Product;
import com.optimisticchemicalmakers.mapfood.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    // -----------------------------------------------------------------------------------------------------------------
    // Repository/Factory
    // -----------------------------------------------------------------------------------------------------------------
    @Autowired
    private ProductRepository productRepository;

    // -----------------------------------------------------------------------------------------------------------------
    // Services
    // -----------------------------------------------------------------------------------------------------------------

    @Autowired
    private StoreService storeService;

    // -----------------------------------------------------------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------------------------------------------------------

    // OK
    public List<Product> getProductsByStore(String storeProtocol) {
        return new ArrayList<>(storeService.getStore(storeProtocol).getProducts());
    }

    // OK
    public List<Product> getProductsByStore(Long storeId) {
        return new ArrayList<>(storeService.getStore(storeId).getProducts());
    }






}
