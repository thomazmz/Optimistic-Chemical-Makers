package com.optimisticchemicalmakers.mapfood.controllers;

import com.optimisticchemicalmakers.mapfood.dtos.ProductDTO;
import com.optimisticchemicalmakers.mapfood.dtos.StoreDTO;
import com.optimisticchemicalmakers.mapfood.factories.ProductFactory;
import com.optimisticchemicalmakers.mapfood.factories.StoreFactory;
import com.optimisticchemicalmakers.mapfood.models.Product;
import com.optimisticchemicalmakers.mapfood.models.Store;
import com.optimisticchemicalmakers.mapfood.repositories.StoreRepository;
import com.optimisticchemicalmakers.mapfood.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/stores")
public class StoreController {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    StoreService storeService;

    @Autowired
    StoreFactory storeFactory;

    @Autowired
    ProductFactory productFactory;

    @GetMapping
    public ResponseEntity<?> getStores() {
        final Set<Store> stores = storeService.getStores();
        final Set<StoreDTO> storeDTOs = stores.stream()
                .map(s -> storeFactory.getInstance(s))
                .collect(Collectors.toSet());
        return new ResponseEntity<>(storeDTOs, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createStore(@RequestBody final StoreDTO storeDTO) {
        final Store store = new Store(storeDTO.getName());
        final Store savedStore = storeRepository.save(store);
        return new ResponseEntity<>(storeFactory.getInstance(savedStore), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStore(@PathVariable final Long id) {
        final Store store = storeService.getStore(id);
        final StoreDTO storeDTO = storeFactory.getInstance(store);
        return new ResponseEntity<>(storeDTO, HttpStatus.OK);
    }

    @GetMapping("/{id}/products")
    public ResponseEntity<?> getProducts(@PathVariable final Long id) {
        final Set<Product> products = this.storeService.getProducts(id);
        final Set<ProductDTO> productsDTOs = products.stream()
                .map(p -> productFactory.getInstance(p))
                .collect(Collectors.toSet());
        return new ResponseEntity<>(productsDTOs, HttpStatus.OK);
    }

    @PatchMapping("{id}/products")
    public ResponseEntity<?> addProduct(
            @PathVariable final Long id,
            @RequestBody final ProductDTO productDTO) {
        final Product product = new Product(productDTO.getName(), productDTO.getDescription(), productDTO.getPrice());
        final Set<Product> products = this.storeService.addProduct(id, product);
        final Set<ProductDTO> productsDtos = products.stream()
                .map(p -> productFactory.getInstance(p))
                .collect(Collectors.toSet());
        return new ResponseEntity<>(productsDtos, HttpStatus.OK);
    }
}
