package com.OptimisticChemicalMakers.MapFood.controllers;

import com.OptimisticChemicalMakers.MapFood.Services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/store/{storeId}")
public class StoreController {


    @Autowired
    private StoreService storeService;

    // GET /products
    // Get all store products
    @RequestMapping(value = "/products", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> createOrder(@PathVariable Long storeId) {
        return ResponseEntity.ok(storeService.getStoreProducts(storeId));
    }

    // GET /orders
    // Get all store delivery orders
    @RequestMapping(value = "/orders", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getOrders(@PathVariable Long storeId) {
        return ResponseEntity.ok(storeService.getStoreOrders(storeId));
    }

}

