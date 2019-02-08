package com.OptimisticChemicalMakers.MapFood.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OptimisticChemicalMakers.MapFood.models.DeliveryItem;
import com.OptimisticChemicalMakers.MapFood.repositories.DeliveryItemRepository;

@Service
public class DeliveryItemService {
	
	@Autowired
    private DeliveryItemRepository deliveryItemRepository;

	public DeliveryItem save(DeliveryItem deliveryItem) {
		return deliveryItemRepository.save(deliveryItem);
	}
	
	
}
