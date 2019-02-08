package com.OptimisticChemicalMakers.MapFood.controllers;

import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryOrderDto;
import com.OptimisticChemicalMakers.MapFood.dtos.ProductDto;
import com.OptimisticChemicalMakers.MapFood.dtos.StoreDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/requestor")
public class RequestorController {

	
	
    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/requestor/stores
    // Requestor faz uma busca por Stores disponíveis na sua região
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("/stores")
    public List<StoreDto> getAvailableSttores(
            @RequestParam("latitude") Long latitude,
            @RequestParam("longitude") Long longitude,
            @RequestParam("radius") Long radius) {
    	return null;
//    	return storeService
//        		.getNearestStores(latitude,longitude,radius)
//        		.stream()
//        		.map(store -> storeFactory.getInstance(store, store.distanceTo(latitude, longitude)))
//        		.collect(Collectors.toList());
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/requestor/store/{protocol}/products
    // Requestor faz uma busca de produtos disponíveis em uma determinada Store
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("/store/{protocol}/products")
    public List<ProductDto> getProducts(
            @PathVariable(value="protocol") String protocol) {
        //return productService.getByHashRestaurant(protocol);
    	return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // POST /api/requestor/{userId}/order
    // Requestor cria uma DeliveryOrder
    // -----------------------------------------------------------------------------------------------------------------
    @PostMapping("/{id}/order")
    public DeliveryOrderDto createDeliveryOrder(
            @PathVariable(value="id") String id,
            @RequestBody DeliveryOrderDto deliveryOrderDto) {
    	//return storeService.createDeliveryOrder(id, deliveryOrderDto);
    	return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/requestor/{userId}/order/{orderId}
    // Requestor verifica informações sobre a DeliveryOrder (Ex: status -> wating | preparing | delivering | delivered)
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("{id}/order/{orderId}")
    public String getDeliveryorder(
            @PathVariable(value="id") String id) {
        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/requestor/{userId}/order/{orderId}
    // Requestor verifica lista de entregas já solicitadas
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("{id}/orders")
    public List<DeliveryOrderDto> getDeliveryOrders(
            @PathVariable(value="id") String id) {
        return null;
    }
}