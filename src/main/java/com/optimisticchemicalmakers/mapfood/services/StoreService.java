package com.optimisticchemicalmakers.mapfood.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.optimisticchemicalmakers.mapfood.dtos.StoreDto;
import com.optimisticchemicalmakers.mapfood.factories.DeliveryOrderFactory;
import com.optimisticchemicalmakers.mapfood.factories.ProductFactory;
import com.optimisticchemicalmakers.mapfood.factories.StoreFactory;
import com.optimisticchemicalmakers.mapfood.models.DeliveryOrder;
import com.optimisticchemicalmakers.mapfood.models.DeliveryRoute;
import com.optimisticchemicalmakers.mapfood.models.Store;
import com.optimisticchemicalmakers.mapfood.repositories.StoreRepository;

@CrossOrigin(origins="http://localhost:4200") // Temporary for the Angular App test
@Service
public class StoreService {

    // -----------------------------------------------------------------------------------------------------------------
    // Service Constants
    // -----------------------------------------------------------------------------------------------------------------

    private Double searestStoresRadius = 3D; // In km

    // -----------------------------------------------------------------------------------------------------------------
    // Repository/Factory
    // -----------------------------------------------------------------------------------------------------------------

    @Autowired
    private StoreRepository storeRepository;

    @Autowired
    private StoreFactory storeFactory;

    // -----------------------------------------------------------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------------------------------------------------------

    // OK
    public Store getStore(String protocol) {
        return storeRepository.getStoreByProtocol(protocol);
    }

    // OK
    public Store getStore(Long id) {
        return storeRepository.getStoreById(id);
    }

    // OK
    public Store createStore(Store store) {
        return storeRepository.save(store);
    }

    // OK
    public Store createStore(StoreDto storeDto) {
        return this.createStore(storeFactory.getInstance(storeDto));
    }

    // OK
    public List<Store> getNearestStores( Double latitude, Double longitude, Double radius) {
        return storeRepository.getNearestStores(latitude, longitude, radius);
    }

    // OK
    public List<Store> getNearestStores( Double latitude, Double longitude) {
        return this.getNearestStores(latitude, longitude, this.searestStoresRadius);
    }

    // ------------------------------------------------------------

    public List<DeliveryOrder> getDeliveryOrders(String protocol, Date start, Date end) {
        return null;
    }

    public List<DeliveryOrder> getOngoingDeliveryOrders(String protocol) {
        return null;
    }

    public List<DeliveryOrder> getWatingDeliveryOrders(String protocol) {
        return null;
    }

    public List<DeliveryOrder> acceptDeliveryorder(String protocol) {
        return null;
    }

    public DeliveryRoute createDeliveryRoute(String protocol, List<String> deliveryOrdersProtocols) {
        return null;
    }

    public DeliveryRoute createDeliveryRoute(String protocol, String deliveryOrderProtocol) {
        return null;
    }

    public Store save(Store store) {
        return storeRepository.save(store);
    }

}
