package com.OptimisticChemicalMakers.MapFood.repositories;

import com.OptimisticChemicalMakers.MapFood.models.Store;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StoreRepository extends CrudRepository<Store, Long> {

	String HAVERSINE_PART = "(6371 * acos(cos(radians(:latitude)) * cos(radians(s.latitude)) * cos(radians(s.longitude) - radians(:longitude)) + sin(radians(:latitude)) * sin(radians(s.latitude))))";

    @Query(value="SELECT s.*, "+HAVERSINE_PART+" AS distance FROM store s HAVING distance <= :distance order by distance",nativeQuery = true)
    List<Store> getNearestStores(@Param("latitude") Float latitude, @Param("longitude") Float longitude, @Param("distance") Long distance);
    
	Optional<Store> findByHash(String restaurantId);

}