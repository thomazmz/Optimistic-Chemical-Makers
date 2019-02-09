package com.optimisticchemicalmakers.mapfood.factories;

import org.springframework.stereotype.Component;

import com.optimisticchemicalmakers.mapfood.dtos.DeliveryItemDto;
import com.optimisticchemicalmakers.mapfood.models.DeliveryItem;

@Component
public class DeliveryItemFactory {

    public DeliveryItem getInstance(DeliveryItemDto deliveryItemDto) {

        DeliveryItem deliveryItem = new DeliveryItem();

        deliveryItem.setQuantity(deliveryItemDto.getQuantity());

        return deliveryItem;

    }

    public DeliveryItemDto getInstance(DeliveryItem deliveryItem) {

        DeliveryItemDto deliveryItemDto = new DeliveryItemDto();

        deliveryItemDto.setProtocol(deliveryItem.getProtocol());

        deliveryItemDto.setQuantity(deliveryItem.getQuantity());

        deliveryItemDto.setProtuctProtocol(deliveryItem.getProduct().getProtocol());

        deliveryItemDto.setDeliveryOrderProtocol(deliveryItem.getDeliveryOrder().getProtocol());

        return deliveryItemDto;

    }


}
