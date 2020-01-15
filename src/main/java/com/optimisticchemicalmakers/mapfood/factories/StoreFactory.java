package com.optimisticchemicalmakers.mapfood.factories;

import com.optimisticchemicalmakers.mapfood.dtos.StoreDTO;
import com.optimisticchemicalmakers.mapfood.models.Store;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class StoreFactory {

    public StoreDTO getInstance(Store store) {
        Set<Long> productsIds = store.getProducts().stream()
                .map(product -> product.getId())
                .collect(Collectors.toSet());

        StoreDTO storeDTO = new StoreDTO();
        storeDTO.setId(store.getId());
        storeDTO.setUuid(store.getUuid());
        storeDTO.setName(store.getName());
        storeDTO.setProducts(productsIds);

        return storeDTO;
    }
}
