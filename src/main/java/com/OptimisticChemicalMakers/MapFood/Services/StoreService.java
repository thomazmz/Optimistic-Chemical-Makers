package com.OptimisticChemicalMakers.MapFood.Services;

import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;
import com.OptimisticChemicalMakers.MapFood.models.Product;
import com.OptimisticChemicalMakers.MapFood.models.Store;
import com.OptimisticChemicalMakers.MapFood.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;


    public Store getStoreInfo(Long id) {

        return storeRepository.findById(id).get();

    }

    public Set<Product> getStoreProducts(Long id) {

        Store store = storeRepository.findById(id).get();

        return store.getAvailableProducts();

    }

    public Set<DeliveryOrder> getStoreOrders(Long id) {

        Store store = storeRepository.findById(id).get();

        return store.getDeliveryOrders();

    }


}