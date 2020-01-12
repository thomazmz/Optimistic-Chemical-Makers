package com.optimisticchemicalmakers.mapfood.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stores")
public class StoreController {

    @GetMapping
    public ResponseEntity<?> createStore() {
        return new ResponseEntity<>("First application endpoint!", HttpStatus.ACCEPTED);
    }

}
