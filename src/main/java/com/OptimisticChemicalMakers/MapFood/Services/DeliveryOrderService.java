package com.OptimisticChemicalMakers.MapFood.Services;

import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryOrderDto;
import com.OptimisticChemicalMakers.MapFood.factories.DeliveryOrderFactory;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryItem;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;
import com.OptimisticChemicalMakers.MapFood.models.Store;
import com.OptimisticChemicalMakers.MapFood.repositories.DeliveryItemRepository;
import com.OptimisticChemicalMakers.MapFood.repositories.DeliveryOrderRepository;
import com.OptimisticChemicalMakers.MapFood.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryOrderService {

    @Autowired
    private StoreRepository storeRepository;


    @Autowired
    private DeliveryOrderFactory deliveryOrderFactory;

    @Autowired
    private DeliveryOrderRepository deliveryOrderRepository;
    
    @Autowired
    private DeliveryItemRepository deliveryItemRepository;

    // Service Methods

    public DeliveryOrderDto createDeliveryOrder(DeliveryOrderDto deliveryOrderDto) {
    	
//    	Store store = storeRepository.findById(deliveryOrderDto.getId()).orElseThrow(RuntimeException::new);
//        DeliveryOrder deliveryOrder = deliveryOrderFactory.getInstance(deliveryOrderDto);
//        store.addDeliveryOrder(deliveryOrder);
//        storeRepository.save(store);
        
        
    	Store store = storeRepository.findByHash(deliveryOrderDto.getRestaurantId()).orElseThrow(RuntimeException::new);
   	    DeliveryOrder deliveryOrder = deliveryOrderFactory.getInstance(deliveryOrderDto);
   	    deliveryOrder.start();
        deliveryOrder = deliveryOrderRepository.save(deliveryOrder);
        for (DeliveryItem deliveryItem : deliveryOrder.getDeliveryItems())
        	deliveryItem = deliveryItemRepository.save(deliveryItem);
        store.addDeliveryOrder(deliveryOrder);

        storeRepository.save(store);

        return deliveryOrderDto;
    }
}