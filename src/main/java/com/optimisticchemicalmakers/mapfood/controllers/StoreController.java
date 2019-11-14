package com.optimisticchemicalmakers.mapfood.controllers;

import com.optimisticchemicalmakers.mapfood.dtos.StoreDto;
import com.optimisticchemicalmakers.mapfood.models.Store;
import com.optimisticchemicalmakers.mapfood.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/stores")
public class StoreController {

    @Autowired
    StoreRepository storeRepository;

    @GetMapping
    public ResponseEntity<?> firstEndpoint() {
        return new ResponseEntity<>("First application endpoint!", HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<?> createStore(@RequestBody final StoreDto storeDto) {
        Store store = new Store(storeDto.getName());
        store = storeRepository.save(store);
        return new ResponseEntity<>(store, HttpStatus.ACCEPTED);
    }
}
