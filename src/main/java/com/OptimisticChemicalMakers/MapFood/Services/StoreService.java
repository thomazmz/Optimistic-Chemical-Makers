package com.OptimisticChemicalMakers.MapFood.Services;

import com.OptimisticChemicalMakers.MapFood.dtos.DeliveryOrderDto;
import com.OptimisticChemicalMakers.MapFood.dtos.ProductDto;
import com.OptimisticChemicalMakers.MapFood.dtos.StoreDto;
import com.OptimisticChemicalMakers.MapFood.factories.DeliveryOrderFactory;
import com.OptimisticChemicalMakers.MapFood.factories.ProductFactory;
import com.OptimisticChemicalMakers.MapFood.factories.StoreFactory;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;
import com.OptimisticChemicalMakers.MapFood.models.Product;
import com.OptimisticChemicalMakers.MapFood.models.Store;
import com.OptimisticChemicalMakers.MapFood.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@CrossOrigin(origins="http://localhost:4200") // Temporary for the Angular App test
@Service
public class StoreService {

    // Repositories

    @Autowired
    private StoreRepository storeRepository;

    // Factories

    @Autowired
    private ProductFactory productFactory;

    @Autowired
    private StoreFactory storeFactory;

    @Autowired
    private DeliveryOrderFactory deliveryOrderFactory;
    
    @Autowired
    private GeolocationService geolocationService;

    // Methods - Store

    public List<StoreDto> getStores() {

        return StreamSupport.stream(storeRepository.findAll().spliterator(), false)
                .map(storeFactory::getInstance)
                .collect(Collectors.toList());

    }
    
    public List<StoreDto> getCloser(Float latitude, Float longitude) {
    	int distance = 5;
    	return  storeRepository
    			.getCloser(latitude, longitude, distance)
				.stream()
				.map(store -> {
					store.setDistance(geolocationService.getDistance(latitude, longitude, store.getLatitude(), store.getLongitude()));
					return storeFactory.getInstance(store);
				})
		        .collect(Collectors.toList());
	}
    
    public Store getStore(String restaurantId) {
        return storeRepository.findByRestaurantId(restaurantId).orElseThrow(RuntimeException::new);
    }

    public StoreDto getStore(Long id) {

        return storeFactory.getInstance(storeRepository.findById(id).orElseThrow(RuntimeException::new));

    }

    public StoreDto createStore(StoreDto storeDto) {

        Store store = storeRepository.save(storeFactory.getInstance(storeDto));

        return storeFactory.getInstance(store);

    }

    // Methods - Store/Products

    
    public List<ProductDto> getProducts(Long id) {
    	
        Store store = storeRepository.findById(id).orElseThrow(RuntimeException::new);
        
        return StreamSupport.stream(store.getAvailableProducts().spliterator(), false)
                .map(productFactory::getInstance)
                .collect(Collectors.toList());

    }

    public ProductDto createProduct(Long id, ProductDto productDto) {

        Store store = storeRepository.findById(id).orElseThrow(RuntimeException::new);

        Product product = productFactory.getInstance(productDto);

        store.addProduct(product);

        storeRepository.save(store);

        return productFactory.getInstance(product);

    }

    // Methods - Store/DeliveryOrders

    public List<DeliveryOrderDto> getDeliveryOrders(Long id) {

        Store store = storeRepository.findById(id).orElseThrow(RuntimeException::new);

        return StreamSupport.stream(store.getDeliveryOrders().spliterator(), false)
                .map(deliveryOrderFactory::getInstance)
                .collect(Collectors.toList());

    }

    public DeliveryOrderDto createDeliveryOrder (Long id, DeliveryOrderDto deliveryOrderDto) {

        // TO DO : Verificar se os produtos solicitados pertencem ao restaurante;

        Store store = storeRepository.findById(id).orElseThrow(RuntimeException::new);

        DeliveryOrder deliveryOrder = deliveryOrderFactory.getInstance(deliveryOrderDto);

        deliveryOrder.setStore(store);

        store.addDeliveryOrder(deliveryOrder);

        storeRepository.save(store);

        return deliveryOrderFactory.getInstance(deliveryOrder);

    }


}

