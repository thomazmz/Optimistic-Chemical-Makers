package com.optimisticchemicalmakers.mapfood.repositories;

import com.optimisticchemicalmakers.mapfood.models.Store;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface StoreRepository extends CrudRepository<Store, Long> {

    Store save(Store store);

    Store findStoreById(Long id);

    Set<Store> findAll();

}