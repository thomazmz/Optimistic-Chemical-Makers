package com.optimisticchemicalmakers.mapfood.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optimisticchemicalmakers.mapfood.dtos.DeliveryOrderDto;
import com.optimisticchemicalmakers.mapfood.models.DeliveryOrder;
import com.optimisticchemicalmakers.mapfood.models.Product;
import com.optimisticchemicalmakers.mapfood.models.Store;

@Service
public class RequestorService {

	@Autowired
	private StoreService storeService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private DeliveryOrderService deliveryOrderService;
	
	public List<Store> getNearestStores(Float latitude, Float longitude, Long radius) {
		return storeService.getNearestStores(latitude, longitude, radius);
	}

	public List<Product> getProductByStoreProtocol(String protocol) {
		return productService.getByStoreProtocol(protocol);
	}

	public DeliveryOrder createDeliveryOrder(String id, DeliveryOrderDto deliveryOrderDto) {
		return deliveryOrderService.createDeliveryOrder(deliveryOrderDto);
	}
	
}
