package com.optimisticchemicalmakers.mapfood.factories;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.optimisticchemicalmakers.mapfood.dtos.DeliveryItemDto;
import com.optimisticchemicalmakers.mapfood.dtos.DeliveryOrderDto;
import com.optimisticchemicalmakers.mapfood.models.Requestor;
import com.optimisticchemicalmakers.mapfood.models.DeliveryItem;
import com.optimisticchemicalmakers.mapfood.models.DeliveryOrder;

@Component
public class DeliveryOrderFactory {

    @Autowired
    DeliveryItemFactory deliveryItemFactory;

    public DeliveryOrder getInstance(DeliveryOrderDto deliveryOrderDto) {

        DeliveryOrder deliveryOrder = new DeliveryOrder();

        deliveryOrder.setLatitude(deliveryOrderDto.getEndingLatitude());

        deliveryOrder.setLongitude(deliveryOrderDto.getEndingLongitude());

        Set<DeliveryItem> deliveryItems = StreamSupport.stream(deliveryOrderDto.getDeliveryItems().spliterator(), false)
                .map(deliveryItemFactory::getInstance)
                .collect(Collectors.toSet());
        
        deliveryItems.forEach(deliveryItem -> deliveryItem.setDeliveryOrder(deliveryOrder));

        deliveryOrder.setDeliveryItems(deliveryItems);

        return deliveryOrder;

    }

    public DeliveryOrderDto getInstance(DeliveryOrder deliveryOrder) {

        DeliveryOrderDto deliveryOrderDto = new DeliveryOrderDto();

        deliveryOrderDto.setProtocol(deliveryOrder.getProtocol());

        deliveryOrderDto.setStoreProtocol(deliveryOrder.getStore().getProtocol());

        deliveryOrderDto.setRequestorProtocol(deliveryOrder.getRequestor().getProtocol());
        
        deliveryOrderDto.setEndingLatitude(deliveryOrder.getLatitude());

        deliveryOrderDto.setEndingLongitude(deliveryOrder.getLongitude());

        Set<DeliveryItemDto> deliveryItems = StreamSupport.stream(deliveryOrder.getDeliveryItems().spliterator(), false)
                .map(deliveryItemFactory::getInstance)
                .collect(Collectors.toSet());

        deliveryOrderDto.setDeliveryItems(deliveryItems);

        return deliveryOrderDto;

    }

    public List<DeliveryOrderDto> getInstanceList(List<DeliveryOrder> deliveryOrders) {

        return deliveryOrders.stream().map(deliveryOrder -> getInstance(deliveryOrder)).collect(Collectors.toList());

    }
}