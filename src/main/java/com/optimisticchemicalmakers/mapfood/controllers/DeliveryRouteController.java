package com.optimisticchemicalmakers.mapfood.controllers;

import com.optimisticchemicalmakers.mapfood.models.DeliveryRoute;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class DeliveryRouteController {

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/order/{orderProtocol}
    // Obter informações sobre a DeliveryRoute
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("/{protocol}")
    public ResponseEntity<DeliveryRoute> getDeliveryorder(
            @PathVariable(value="protocol") String protocol) {
        return null;
    }

}
