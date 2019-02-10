package com.optimisticchemicalmakers.mapfood.controllers;

import com.optimisticchemicalmakers.mapfood.dtos.DeliveryOrderDto;
import com.optimisticchemicalmakers.mapfood.dtos.ProductDto;
import com.optimisticchemicalmakers.mapfood.factories.ProductFactory;
import com.optimisticchemicalmakers.mapfood.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/products")
public class ProductsController {

    // -----------------------------------------------------------------------------------------------------------------
    // Service
    // -----------------------------------------------------------------------------------------------------------------
    @Autowired
    private ProductService productService;

    // -----------------------------------------------------------------------------------------------------------------
    // Factories
    // -----------------------------------------------------------------------------------------------------------------
    @Autowired
    private ProductFactory productFactory;

    // OK
    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/products/store/{storeProtocol}
    // Retorna Products disponíveis de acordo com um storeProtocol
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("/store/{storeProtocol}")
    public ResponseEntity<List<ProductDto>> getProductsByStore(
            @PathVariable String storeProtocol) {

        return ResponseEntity.ok(productFactory
                .getListInstance(productService
                        .getProductsByStore(storeProtocol)));
    }


}
