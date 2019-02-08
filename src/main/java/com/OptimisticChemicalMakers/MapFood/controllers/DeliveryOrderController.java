package com.OptimisticChemicalMakers.MapFood.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OptimisticChemicalMakers.MapFood.Services.DeliveryOrderService;
import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryOrderDto;

@CrossOrigin(origins="http://localhost:4200") // Temporary for the Angular App test
@RestController
@RequestMapping(value = "/order")
public class DeliveryOrderController {

    @Autowired
    private DeliveryOrderService deliveryOrderService;

    
    // POST /create
    // Create Delivery Order
    @PostMapping(value = "/create")
    public ResponseEntity<?> createOrder(@RequestBody DeliveryOrderDto deliveryOrderDto) {
        return ResponseEntity.ok(deliveryOrderService.createDeliveryOrder(deliveryOrderDto));
    }

    // PUST /update
    // Update Delivery Order
    @PutMapping(value="/update/{id}")
    public ResponseEntity<?> updateOrder(@RequestBody DeliveryOrderDto deliveryOrderDto) {
        return ResponseEntity.ok(deliveryOrderService.updateDeliveryOrder(deliveryOrderDto));
    }
    
    // GET /openorders
    // Get delivery orders by store id
    @GetMapping(value="/openorders")
    public List<DeliveryOrderDto> getOpenOrders() {
        return deliveryOrderService.openOrders();
    }
}



