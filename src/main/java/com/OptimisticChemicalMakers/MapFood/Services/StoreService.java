package com.OptimisticChemicalMakers.MapFood.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.OptimisticChemicalMakers.MapFood.dtos.StoreDto;
import com.OptimisticChemicalMakers.MapFood.factories.DeliveryOrderFactory;
import com.OptimisticChemicalMakers.MapFood.factories.ProductFactory;
import com.OptimisticChemicalMakers.MapFood.factories.StoreFactory;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;
import com.OptimisticChemicalMakers.MapFood.models.DeliveryRoute;
import com.OptimisticChemicalMakers.MapFood.models.Store;
import com.OptimisticChemicalMakers.MapFood.repositories.StoreRepository;

@CrossOrigin(origins="http://localhost:4200") // Temporary for the Angular App test
@Service
public class StoreService {

    // -----------------------------------------------------------------------------------------------------------------
    // Repository (Manter apenas um Repository por service)
    // -----------------------------------------------------------------------------------------------------------------

    @Autowired
    private StoreRepository storeRepository;


    // -----------------------------------------------------------------------------------------------------------------
    // Factories
    // -----------------------------------------------------------------------------------------------------------------

    @Autowired
    private ProductFactory productFactory;

    @Autowired
    private StoreFactory storeFactory;

    @Autowired
    private DeliveryOrderFactory deliveryOrderFactory;


    // -----------------------------------------------------------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------------------------------------------------------

    // -----------------------------------------------------------------------------------------------------------------
    // Method - getStore
    // -----------------------------------------------------------------------------------------------------------------
    public Store getStore(String protocol) {
        return storeRepository.getStoreByProtocol(protocol);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Method - createStore
    // -----------------------------------------------------------------------------------------------------------------
    public Store createStore(StoreDto storeDto) {
        return storeRepository.save(storeFactory.getInstance(storeDto));
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Method - getDeliveryOrders
    // -----------------------------------------------------------------------------------------------------------------
    public List<DeliveryOrder> getDeliveryOrders(String protocol, Date start, Date end) {
        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Method - getOngoingDeliveryOrders
    // -----------------------------------------------------------------------------------------------------------------
    public List<DeliveryOrder> getOngoingDeliveryOrders(String protocol) {
        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Method - getWatingDeliveryOrders
    // -----------------------------------------------------------------------------------------------------------------
    public List<DeliveryOrder> getWatingDeliveryOrders(String protocol) {
        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Method - acceptDeliveryorder
    // -----------------------------------------------------------------------------------------------------------------
    public List<DeliveryOrder> acceptDeliveryorder(String protocol) {
        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Method - createDeliveryRoute
    // -----------------------------------------------------------------------------------------------------------------
    public DeliveryRoute createDeliveryRoute(String protocol, List<String> deliveryOrdersProtocols) {
        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Method - createDeliveryRoute
    // -----------------------------------------------------------------------------------------------------------------
    public DeliveryRoute createDeliveryRoute(String protocol, String deliveryOrderProtocol) {
        return null;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Method - getNearestStores
    // -----------------------------------------------------------------------------------------------------------------
    
    public List<Store> getNearestStores( Float latitude, Float longitude, Long radius) {
        radius = 5L;
        return storeRepository.getNearestStores(latitude, longitude, radius);
    }

    public Store save(Store store) {
        return storeRepository.save(store);
    }

}
