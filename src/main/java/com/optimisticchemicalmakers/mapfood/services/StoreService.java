package com.optimisticchemicalmakers.mapfood.services;

import com.optimisticchemicalmakers.mapfood.models.Product;
import com.optimisticchemicalmakers.mapfood.models.Store;
import com.optimisticchemicalmakers.mapfood.repositories.ProductRepository;
import com.optimisticchemicalmakers.mapfood.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Autowired
    private ProductRepository productRepository;

    public Set<Product> addProduct(Long storeId, Product product) {
        Store store = storeRepository.findStoreById(storeId);
        product.setStore(store);
        productRepository.save(product);
        return store.getProducts();
    }

    public Set<Product> getProducts(Long storeId) {
        Store store = this.storeRepository.findStoreById(storeId);
        return store.getProducts();
    }

    public Store getStore(Long storeId) {
        Store store = this.storeRepository.findStoreById(storeId);
        return store;
    }

    public Set<Store> getStores() {
        return this.storeRepository.findAll();
    }
}