package com.optimisticchemicalmakers.mapfood.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.optimisticchemicalmakers.mapfood.dtos.DeliveryRouteDto;
import com.optimisticchemicalmakers.mapfood.dtos.StoreDto;
import com.optimisticchemicalmakers.mapfood.factories.DeliveryOrderFactory;
import com.optimisticchemicalmakers.mapfood.factories.DeliveryRouteFactory;
import com.optimisticchemicalmakers.mapfood.factories.StoreFactory;
import com.optimisticchemicalmakers.mapfood.services.StoreService;


@RestController
@RequestMapping(value = "/api/store")
public class StoreController {

    // -----------------------------------------------------------------------------------------------------------------
    // Service (Manter apenas um service por controller)
    // -----------------------------------------------------------------------------------------------------------------

    @Autowired
    private StoreService storeService;

    // -----------------------------------------------------------------------------------------------------------------
    // Factories
    // -----------------------------------------------------------------------------------------------------------------

    @Autowired
    private StoreFactory storeFactory;
    @Autowired
    private DeliveryOrderFactory deliveryOrderFactory;
    @Autowired
    private DeliveryRouteFactory deliveyRouteFactory;

    // -----------------------------------------------------------------------------------------------------------------
    // Route Methods
    // -----------------------------------------------------------------------------------------------------------------

    // OK
    // -----------------------------------------------------------------------------------------------------------------
    // POST /
    // Cria uma nova Store no banco de dados
    // -----------------------------------------------------------------------------------------------------------------
    @PostMapping("/")
    public ResponseEntity<StoreDto> createStore(
            @RequestBody StoreDto storeDto) {

        return ResponseEntity.ok(storeFactory
                .getInstance(storeService
                        .createStore(storeDto)));
    }

    // OK
    // -----------------------------------------------------------------------------------------------------------------
    // GET /
    // Retorna Store baseado no protoolo
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("/{protocol}")
    public ResponseEntity<StoreDto> getStore(
            @PathVariable(value = "protocol") String protocol) {

        return ResponseEntity.ok(storeFactory
                .getInstance(storeService
                        .getStore(protocol)));
    }

    // OK
    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/requestor/stores
    // Retorna Stores disponíveis em uma região
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("/stores")
    public List<StoreDto> getAvailableStores(
            @RequestParam("latitude") Double latitude,
            @RequestParam("longitude") Double longitude) {

        return storeService
                .getNearestStores(latitude,longitude)
                .stream()
                .map(store -> storeFactory.getInstance(store, store.distanceTo(latitude, longitude)))
                .collect(Collectors.toList());
    }

    // -----------------------------------------------------------------------------------------------------------------
    // POST /api/store/{storeProtocol}/route
    // Store pode solicitar o agrupamento de entregas através da criação de uma deliveryRoute
    // -----------------------------------------------------------------------------------------------------------------
    @PostMapping("{protocol}/route")
    public ResponseEntity<DeliveryRouteDto> createDeliveryRoute(
            @PathVariable(value="protocol") String protocol,
            @RequestBody ArrayList<String> deliveryOrdersIds) {

        return ResponseEntity.ok(deliveyRouteFactory
            .getInstance(storeService
                .createDeliveryRoute(protocol, deliveryOrdersIds)));
    }

    // -----------------------------------------------------------------------------------------------------------------
    // POST /api/store/{storeProtocol}/order/{deliveryOrderId}/deliveryboy
    // Store pode solicitar um DeliveryBoy para a DeliveryOrder
    // -----------------------------------------------------------------------------------------------------------------
    @PostMapping("{protocol}/stores/order/{deliverOrderId}/deliveryboy")
    public ResponseEntity<DeliveryRouteDto> assignDeliveryOrder(
            @PathVariable(value="protocol") String protocol,
            @PathVariable(value="deliverOrderId") String deliverOrderId) {

        return ResponseEntity.ok(deliveyRouteFactory
            .getInstance(storeService
                .createDeliveryRoute(protocol, deliverOrderId)));
    }
}