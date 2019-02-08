package com.OptimisticChemicalMakers.MapFood.Services;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryOrderDto;
import com.OptimisticChemicalMakers.MapFood.factories.DeliveryOrderFactory;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryItem;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;
import com.OptimisticChemicalMakers.MapFood.models.Store;
import com.OptimisticChemicalMakers.MapFood.repositories.DeliveryOrderRepository;

@Service
public class DeliveryOrderService {

    @Autowired
    private StoreService storeService;

    @Autowired
    private DeliveryOrderFactory deliveryOrderFactory;

    @Autowired
    private DeliveryOrderRepository deliveryOrderRepository;
    
    @Autowired
    private DeliveryItemService deliveryItemService;

    // Service Methods

    public DeliveryOrderDto createDeliveryOrder(DeliveryOrderDto deliveryOrderDto) {
        
    	Long estimatedPreparationTime = 600000L; // 10 min
    	Long kmTimeTraveled = 12000L; // 2 min
    	
    	DeliveryOrder deliveryOrder = deliveryOrderFactory.getInstance(deliveryOrderDto);
    	
    	Store store = storeService.getStore(deliveryOrderDto.getHashRestaurant());
   	    deliveryOrder.setStore(store);
   	    
    	Double distance = store.distanceTo(deliveryOrderDto.getEndingLatitude(), deliveryOrderDto.getEndingLongitude());
    	
    	deliveryOrder.start();
    	Date estimatedTime = new Date();
    	estimatedTime.setTime((long) (deliveryOrder.getCreatedAt().getTime() + (distance * kmTimeTraveled) + estimatedPreparationTime));
    	deliveryOrder.setEstimatedDevliveryTime(estimatedTime);
    	deliveryOrderDto.setEstimatedDevliveryTime(estimatedTime);
    	
        deliveryOrder = deliveryOrderRepository.save(deliveryOrder);
        for (DeliveryItem deliveryItem : deliveryOrder.getDeliveryItems())
        	deliveryItem = deliveryItemService.save(deliveryItem);
        store.addDeliveryOrder(deliveryOrder);

        storeService.save(store);
        return deliveryOrderDto;
    }

	public DeliveryOrderDto updateDeliveryOrder(DeliveryOrderDto deliveryOrderDto) {
		DeliveryOrder deliveryOrder = deliveryOrderFactory.getInstance(deliveryOrderDto);
		// TODO falta implementar
		return deliveryOrderDto;
	}

	public List<DeliveryOrderDto> openOrders() {
		return deliveryOrderRepository
				.findByPreparedAtIsNull()
				.stream()
				.map(deliveryOrderFactory::getInstance)
				.collect(Collectors.toList());
	}
}