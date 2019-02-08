package com.OptimisticChemicalMakers.MapFood.controllers;

import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryOrderDto;
import com.OptimisticChemicalMakers.MapFood.dtos.ProductDto;
import com.OptimisticChemicalMakers.MapFood.dtos.StoreDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/requestor")
public class RequestorController {

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/requestor/{userId}/stores
    // Requestor faz uma busca por Stores disponíveis na sua região
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("{id}/stores")
    public List<StoreDto> getAvailableSttores(
            @PathVariable(value="id") String id,
            @RequestParam("latitude") Long latitude,
            @RequestParam("longitude") Long longitude) {
        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/requestor/{userId}/store/products
    // Requestor faz uma busca de produtos disponíveis em uma determinada Store
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("{id}/store/products")
    public List<ProductDto> getProducts(
            @PathVariable(value="id") String id) {
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