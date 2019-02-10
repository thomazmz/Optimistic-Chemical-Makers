package com.optimisticchemicalmakers.mapfood.controllers;

import com.optimisticchemicalmakers.mapfood.dtos.DeliveryOrderDto;
import com.optimisticchemicalmakers.mapfood.factories.DeliveryOrderFactory;
import com.optimisticchemicalmakers.mapfood.services.DeliveryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/api/orders")
public class DeliveryOrderController {

    // -----------------------------------------------------------------------------------------------------------------
    // Service
    // -----------------------------------------------------------------------------------------------------------------
    @Autowired
    private DeliveryOrderService deliveryOrderService;

    // -----------------------------------------------------------------------------------------------------------------
    // Factories
    // -----------------------------------------------------------------------------------------------------------------
    @Autowired
    private DeliveryOrderFactory deliveryOrderFactory;

    // -----------------------------------------------------------------------------------------------------------------
    // POST /api/order/
    // Criar uma deliveryOrder
    // -----------------------------------------------------------------------------------------------------------------
    @PostMapping("/")
    public ResponseEntity<DeliveryOrderDto> createDeliveryOrder(
            @RequestBody DeliveryOrderDto deliveryOrderDto) {

        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/orders/{protocol}
    // Obter informações sobre UMA DeliveryOrder
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("/{protocol}")
    public ResponseEntity<DeliveryOrderDto> getDeliveryorder(
            @PathVariable String protocol) {

        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // PULL /api/orders/{orderProtocol}
    // Editar informações sobre a deliveryOrder
    // -----------------------------------------------------------------------------------------------------------------
    @PutMapping("/{protocol}")
    public ResponseEntity<DeliveryOrderDto> updateDeliveryorder(
            @PathVariable String protocol,
            @RequestBody DeliveryOrderDto deliveryOrderDto) {

        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/orders/filter
    // Retorna DeliveryOrders baseando-se em parâmetros
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("/filter")
    public ResponseEntity<List<DeliveryOrderDto>> getDeliveryOrders(
            @RequestParam("requestor") String requestorProtocol,            // Parâmetro opcional
            @RequestParam("store") String storeProtocol,                    // Parâmetro opcional
            @RequestParam("start") Date start,                              // Parâmetro obrigatório
            @RequestParam("end") Date end) {                                // Parâmetro obrigatório

        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/orders/store/{storeProtocol}/ongoing
    // Retorna DeliveryOrders em andamento baseado no protocolo da Store
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("/store/ongoing/{storeProtocol}")
    public ResponseEntity<List<DeliveryOrderDto>> getOngoingDeliveryOrders(
            @PathVariable String storeProtocol) {

        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GET /api/orders/store/{storeProtocol}/wating
    // Store pode ver as suas DeliveryOrders que ainda não foram aceitas
    // -----------------------------------------------------------------------------------------------------------------
    @GetMapping("{protocol}/order/wating")
    public ResponseEntity<List<DeliveryOrderDto>> getWatingDeliveryOrders(
            @PathVariable String protocol) {

        return null;
    }

}


