package com.OptimisticChemicalMakers.MapFood.controllers;

import com.OptimisticChemicalMakers.MapFood.Services.DeliveryOrderService;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DeliveryOrderController {

    @Autowired
    private DeliveryOrderService deliveryOrderService;

    // POST /
    // Create Delivery Order
    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> createOrder(@RequestBody DeliveryOrder deliveryOrder) {
        return ResponseEntity.ok(deliveryOrderService.createDeliveryOrder(deliveryOrder));
    }

}



