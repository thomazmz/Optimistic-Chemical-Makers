package com.OptimisticChemicalMakers.MapFood.controllers;

import com.OptimisticChemicalMakers.MapFood.Services.StoreService;
import com.OptimisticChemicalMakers.MapFood.dtos.ProductDto;
import com.OptimisticChemicalMakers.MapFood.dtos.StoreDto;
import com.OptimisticChemicalMakers.MapFood.factories.ProductFactory;
import com.OptimisticChemicalMakers.MapFood.factories.StoreFactory;
import com.OptimisticChemicalMakers.MapFood.models.Store;
import com.OptimisticChemicalMakers.MapFood.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping(value = "/api")
public class StoreController {


    @Autowired
    private StoreService storeService;

    @Autowired
    private StoreRepository storeRepository;

    @Autowired
    private StoreFactory storeFactory;

    @Autowired
    private ProductFactory productFactory;


    // Basic CRUD operations

    // GET /api/store
    // Get All Stores
    @GetMapping("/store")
    public List<StoreDto> getAllStores() {
        return StreamSupport.stream(storeRepository.findAll().spliterator(), false).map(storeFactory::getInstance).collect(Collectors.toList());
    }

    // POST /api/store
    // Create a new Store
    @PostMapping("/store")
    public Store createNote(@Valid @RequestBody StoreDto storeDto) {
        return storeRepository.save(storeFactory.getInstance(storeDto));
    }

    // GET /api/store/id
    // Get a Single Store
    @GetMapping("/store/{id}")
    public StoreDto getStoreById(@PathVariable(value = "id") Long storeId) {
        return storeFactory.getInstance(storeRepository.findById(storeId).orElseThrow(RuntimeException::new));
    }

    // GET /api/store/id/products
    // Get products by store id
    @GetMapping(value = "/store/{id}/products")
    public List<ProductDto> getProductsByStoreId(@PathVariable(value="id") Long storeId) {
        Store store = storeRepository.findById(storeId).orElseThrow(RuntimeException::new);
        return StreamSupport.stream(store.getAvailableProducts().spliterator(), false).map(productFactory::getInstance).collect(Collectors.toList());
    }



    //

    // GET /
    // Get store info by id
//    @RequestMapping(value = "/{id}/", method = RequestMethod.GET, produces = "application/json")
//    public Store getStoreInfo(@PathVariable(value = "id") Long storeId) {
//        return storeService.getStoreInfo(storeId);
//    }



    // GET /orders
    // Get all store delivery orders
//    @RequestMapping(value = "/orders", method = RequestMethod.GET, produces = "application/json")
//    public ResponseEntity<?> getOrders(@PathVariable Long storeId) {
//        return ResponseEntity.ok(storeService.getStoreOrders(storeId));
//    }

}

