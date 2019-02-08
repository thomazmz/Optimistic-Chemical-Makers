package com.OptimisticChemicalMakers.MapFood.factories;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryItemDto;
import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryOrderDto;
import com.OptimisticChemicalMakers.MapFood.models.Customer;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryItem;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;

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

        deliveryOrder.setCustomer(new Customer(deliveryOrderDto.getCustomerId()));
        
        deliveryItems.forEach(deliveryItem -> deliveryItem.setDeliveryOrder(deliveryOrder));

        deliveryOrder.setDeliveryItems(deliveryItems);

        return deliveryOrder;

    }

    public DeliveryOrderDto getInstance(DeliveryOrder deliveryOrder) {

        DeliveryOrderDto deliveryOrderDto = new DeliveryOrderDto();

        deliveryOrderDto.setId(deliveryOrder.getId());

        deliveryOrderDto.setHashRestaurant(deliveryOrder.getStore().getHash());

        deliveryOrderDto.setCustomerId(deliveryOrder.getCustomer().getId());
        
        deliveryOrderDto.setEndingLatitude(deliveryOrder.getLatitude());

        deliveryOrderDto.setEndingLongitude(deliveryOrder.getLongitude());

        Set<DeliveryItemDto> deliveryItems = StreamSupport.stream(deliveryOrder.getDeliveryItems().spliterator(), false)
                .map(deliveryItemFactory::getInstance)
                .collect(Collectors.toSet());

        deliveryOrderDto.setDeliveryItems(deliveryItems);

        return deliveryOrderDto;

    }
}