package com.optimisticchemicalmakers.mapfood.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.optimisticchemicalmakers.mapfood.dtos.DeliveryOrderDto;
import com.optimisticchemicalmakers.mapfood.dtos.ProductDto;
import com.optimisticchemicalmakers.mapfood.dtos.StoreDto;
import com.optimisticchemicalmakers.mapfood.factories.DeliveryOrderFactory;
import com.optimisticchemicalmakers.mapfood.factories.ProductFactory;
import com.optimisticchemicalmakers.mapfood.factories.StoreFactory;
import com.optimisticchemicalmakers.mapfood.services.RequestorService;

@RestController
@RequestMapping(value = "/api/requestor")
public class RequestorController {

	@Autowired
	private RequestorService requestorService;
	
	// -----------------------------------------------------------------------------------------------------------------
    // Factories
    // -----------------------------------------------------------------------------------------------------------------

    @Autowired
    private StoreFactory storeFactory;

    @Autowired
    private DeliveryOrderFactory deliveryOrderFactory;

    @Autowired
    private ProductFactory productFactory;
	
    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/requestor/stores
    // Requestor faz uma busca por Stores disponíveis na sua região
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("/stores")
    public List<StoreDto> getAvailableSttores(
            @RequestParam("latitude") Float latitude,
            @RequestParam("longitude") Float longitude,
            @RequestParam("radius") Long radius) {
    	
		return requestorService
				.getNearestStores(latitude,longitude,radius)
				.stream()
				.map(store -> storeFactory.getInstance(store, store.distanceTo(latitude, longitude)))
				.collect(Collectors.toList());
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/requestor/store/{protocol}/products
    // Requestor faz uma busca de produtos disponíveis em uma determinada Store
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("/store/{protocol}/products")
    public List<ProductDto> getProducts(
            @PathVariable(value="protocol") String protocol) {
        return requestorService
        		.getProductByStoreProtocol(protocol)
        		.stream()
				.map(productFactory::getInstance)
				.collect(Collectors.toList());
    }

    // -----------------------------------------------------------------------------------------------------------------
    // POST /api/requestor/{userId}/order
    // Requestor cria uma DeliveryOrder
    // -----------------------------------------------------------------------------------------------------------------
    @PostMapping("/{id}/order")
    public DeliveryOrderDto createDeliveryOrder(
            @PathVariable(value="id") String id,
            @RequestBody DeliveryOrderDto deliveryOrderDto) {
    	return deliveryOrderFactory.getInstance(requestorService.createDeliveryOrder(id, deliveryOrderDto));
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