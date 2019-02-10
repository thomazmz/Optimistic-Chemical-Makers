package com.optimisticchemicalmakers.mapfood.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optimisticchemicalmakers.mapfood.dtos.DeliveryOrderDto;
import com.optimisticchemicalmakers.mapfood.factories.DeliveryOrderFactory;
import com.optimisticchemicalmakers.mapfood.models.DeliveryOrder;
import com.optimisticchemicalmakers.mapfood.models.Requestor;
import com.optimisticchemicalmakers.mapfood.models.Store;
import com.optimisticchemicalmakers.mapfood.repositories.DeliveryOrderRepository;

@Service
public class DeliveryOrderService {

    @Autowired
    private StoreService storeService;
    @Autowired
    private DeliveryOrderFactory deliveryOrderFactory;
    @Autowired
    private DeliveryOrderRepository deliveryOrderRepository;

    // Service Methods

    public DeliveryOrder createDeliveryOrder(DeliveryOrderDto deliveryOrderDto) {

    	Long estimatedPreparationTime = 600000L;    // 10 min
    	Long kmTimeTraveled = 12000L;               // 2 min

        DeliveryOrder deliveryOrder = deliveryOrderFactory.getInstance(deliveryOrderDto);

    	Store store = storeService.getStore(deliveryOrderDto.getStoreProtocol());
   	    deliveryOrder.setStore(store);

    	Double distance = store.distanceTo(deliveryOrder.getLatitude(), deliveryOrder.getLongitude());

    	Date estimatedTime = new Date();
    	estimatedTime.setTime((long) (deliveryOrder.getCreatedAt().getTime() + (distance * kmTimeTraveled) + estimatedPreparationTime));
    	deliveryOrder.setEstimatedDevliveryTime(estimatedTime);
    	deliveryOrderDto.setEstimatedDevliveryTime(estimatedTime);

        deliveryOrder = deliveryOrderRepository.save(deliveryOrder);

        storeService.save(store);
        return deliveryOrder;

    }

	public List<DeliveryOrder> gerDeliveryOrdersByRequestor(Requestor requestor) {
		return deliveryOrderRepository.findByRequestor(requestor);
	}
}