package com.OptimisticChemicalMakers.MapFood.controllers;

import com.OptimisticChemicalMakers.MapFood.Services.StoreService;
import com.OptimisticChemicalMakers.MapFood.dtos.*;
import com.OptimisticChemicalMakers.MapFood.factories.DeliveryOrderFactory;
import com.OptimisticChemicalMakers.MapFood.factories.DeliveryRouteFactory;
import com.OptimisticChemicalMakers.MapFood.factories.StoreFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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

    // -----------------------------------------------------------------------------------------------------------------
    // POST /
    // Cria uma nova Store no banco de dados
    // -----------------------------------------------------------------------------------------------------------------
    @PostMapping("/")
    public ResponseEntity<StoreDto> createStore(
            @RequestBody StoreDto storeDto) {

        return ResponseEntity.ok(storeFactory.getInstance(storeService.createStore(storeDto)));
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GET /
    // Retorna Store baseado no protoolo
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("/{protocol}")
    public ResponseEntity<StoreDto> getStore(
            @PathVariable(value = "protocol") String protocol) {

        return ResponseEntity.ok(storeFactory.getInstance(storeService.getStore(protocol)));
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/store/{storeProtocol}/orders/
    // Store pode ver as suas DeliveryOrders filtradas por uma janela de tempo
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("{protocol}/order")
    public ResponseEntity<List<DeliveryOrderDto>> getDeliveryOrders(
            @PathVariable(value="protocol") String protocol,
            @RequestParam("start") Date start,
            @RequestParam("end") Date end)  {

        return ResponseEntity.ok(
            storeService.getDeliveryOrders(protocol, start, end)
                .stream()
                .map(deliveryOrder -> deliveryOrderFactory.getInstance(deliveryOrder))
                .collect(Collectors.toList()));
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/store/{storeProtocol}/orders/ongoing
    // Store pode ver as suas DeliveryOrders em andamento
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("{protocol}/orders/ongoing")
    public ResponseEntity<List<DeliveryOrderDto>> getOngoingDeliveryOrders(
            @PathVariable(value="protocol") String protocol) {

        return ResponseEntity.ok(
            storeService.getOngoingDeliveryOrders(protocol)
                .stream()
                .map(deliveryOrder -> deliveryOrderFactory.getInstance(deliveryOrder))
                .collect(Collectors.toList()));
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/store/{storeProtocol}/orders/wating
    // Store pode ver as suas DeliveryOrders que ainda não foram aceitas
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("{protocol}/order/wating")
    public ResponseEntity<List<DeliveryOrderDto>> getWatingDeliveryOrders(
            @PathVariable(value="protocol") String protocol) {

        return ResponseEntity.ok(
            storeService
                .getWatingDeliveryOrders(protocol)
                .stream()
                .map(deliveryOrder -> deliveryOrderFactory.getInstance(deliveryOrder))
                .collect(Collectors.toList()));
    }

    // -----------------------------------------------------------------------------------------------------------------
    // POST /api/store/{storeProtocol}/order/{deliveryOrderId}
    // Store pode aceitar uma DeliveryOrder
    // -----------------------------------------------------------------------------------------------------------------
    @PostMapping("{protocol}/order/{deliveryOrderProtocol}")
    public ResponseEntity<?> acceptDeliveryOrder(
            @PathVariable(value="protocol") String protocol,
            @PathVariable(value="deliveryOrderProtocol") String deliveryOrderProtocol) {

        return ResponseEntity.ok(storeService.acceptDeliveryorder(deliveryOrderProtocol));
    }

    // -----------------------------------------------------------------------------------------------------------------
    // POST /api/store/{storeProtocol}/route
    // Store pode solicitar o agrupamento de entregas através da criação de uma deliveryRoute
    // -----------------------------------------------------------------------------------------------------------------
    @PostMapping("{protocol}/route")
    public ResponseEntity<DeliveryRouteDto> createDeliveryRoute(
            @PathVariable(value="protocol") String protocol,
            @RequestBody ArrayList<String> deliveryOrdersIds) {

        return ResponseEntity.ok(deliveyRouteFactory.getInstance(
                    storeService.createDeliveryRoute(protocol, deliveryOrdersIds)));
    }

    // -----------------------------------------------------------------------------------------------------------------
    // POST /api/store/{storeProtocol}/order/{deliveryOrderId}/deliveryboy
    // Store pode solicitar um DeliveryBoy para a DeliveryOrder
    // -----------------------------------------------------------------------------------------------------------------
    @PostMapping("{protocol}/stores/order/{deliverOrderId}/deliveryboy")
    public ResponseEntity<DeliveryRouteDto> assignDeliveryOrder(
            @PathVariable(value="protocol") String protocol,
            @PathVariable(value="deliverOrderId") String deliverOrderId) {

        return ResponseEntity.ok(deliveyRouteFactory.getInstance(
                storeService.createDeliveryRoute(protocol, deliverOrderId)));
    }







    // -----------------------------------------------------------------------------------------------------------------
    // "COLOCAR" NO CONTROLLER DO USUÁRIO:
    // -----------------------------------------------------------------------------------------------------------------

    // GET /api/stores/latitude/longitude
    // Get All Closer Stores
    @GetMapping(value = "/stores/nearest")
    public List<StoreDto> getNearestStores(@RequestParam("latitude") Long latitude, @RequestParam("longitude") Long longitude, @RequestParam("longitude") Long radius) {
        return storeService.getNearestStores(latitude,longitude,radius).stream()
                .map(store -> storeFactory.getInstance(store, store.distanceTo(latitude, longitude)))
                .collect(Collectors.toList());
    }

    // GET /api/store/id/products
    // Get products by store id
    @GetMapping(value = "/store/{id}/products")
    public List<ProductDto> getProducts(@PathVariable(value="id") Long id) {
        return storeService.getProducts(id);
    }

    // POST api/store/id/orders
    // Create a delivery order by store if
    @PostMapping(value="/store/{id}/orders")
    public DeliveryOrderDto createDeliveryOrder(@PathVariable(value="id") Long id, @RequestBody DeliveryOrderDto deliveryOrderDto) {
        return storeService.createDeliveryOrder(id, deliveryOrderDto);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // FORA DO ESCOPO MAS PODE SER UTILIZADO SE SOBRAR TEMPO:
    // -----------------------------------------------------------------------------------------------------------------

    // POST /api/store/id/products
    // Create products by store id
    @PostMapping(value = "/store/{id}/products")
    public ProductDto createProduct( @PathVariable(value="id") Long id, @RequestBody ProductDto productDto) {
        return storeService.createProduct(id, productDto);
    }




}