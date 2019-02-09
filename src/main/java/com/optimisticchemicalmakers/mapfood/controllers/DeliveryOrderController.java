package com.optimisticchemicalmakers.mapfood.controllers;

import com.optimisticchemicalmakers.mapfood.services.DeliveryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryOrderController {

    @Autowired
    DeliveryOrderService deliveryOrderService;




}


