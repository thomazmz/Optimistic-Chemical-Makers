package com.optimisticchemicalmakers.mapfood.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optimisticchemicalmakers.mapfood.dtos.DeliveryOrderDto;
import com.optimisticchemicalmakers.mapfood.models.DeliveryOrder;
import com.optimisticchemicalmakers.mapfood.models.Product;
import com.optimisticchemicalmakers.mapfood.models.Requestor;
import com.optimisticchemicalmakers.mapfood.models.Store;
import com.optimisticchemicalmakers.mapfood.repositories.RequestorRepository;

@Service
public class RequestorService {
	
	// -----------------------------------------------------------------------------------------------------------------
	// Services
	// -----------------------------------------------------------------------------------------------------------------
	
	@Autowired
	private RequestorRepository requestorRepository;
	

	// -----------------------------------------------------------------------------------------------------------------
	// Services
	// -----------------------------------------------------------------------------------------------------------------

	@Autowired
	private StoreService storeService;
	
	@Autowired
	private DeliveryOrderService deliveryOrderService;

	// -----------------------------------------------------------------------------------------------------------------
	// Methods
	// -----------------------------------------------------------------------------------------------------------------

	public List<Store> getNearestStores(Double latitude, Double longitude, Double radius) {
		return storeService.getNearestStores(latitude, longitude, radius);
	}

	public List<Product> getProductByStoreProtocol(String protocol) {
		return storeService.getStore(protocol).getProducts().stream().collect(Collectors.toList());
	}

	public DeliveryOrder createDeliveryOrder(String id, DeliveryOrderDto deliveryOrderDto) {
		return deliveryOrderService.createDeliveryOrder(deliveryOrderDto);
	}

	public List<DeliveryOrder> gerDeliveryOrdersByRequestor(Long id) {
		Optional<Requestor> requestor = requestorRepository.findById(id);
		List<DeliveryOrder> list = null;
		if(requestor.isPresent())
			list = deliveryOrderService.gerDeliveryOrdersByRequestor(requestor.get());
		return list;
	}
	
}
