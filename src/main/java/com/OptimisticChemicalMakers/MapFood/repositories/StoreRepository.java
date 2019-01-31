package com.OptimisticChemicalMakers.MapFood.repositories;

import com.OptimisticChemicalMakers.MapFood.models.Store;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "http://localhost:4200")
public interface StoreRepository extends CrudRepository<Store, String> {
	
	static final String HAVERSINE_PART = "(6371 * acos(cos(radians(:latitude)) * cos(radians(s.latitude)) * cos(radians(s.longitude) - radians(:longitude)) + sin(radians(:latitude)) * sin(radians(s.latitude))))";

	Optional<Store> getByCity(String city);

	@Query(value="SELECT s.*, "+HAVERSINE_PART+" AS distance FROM store s HAVING distance <= :distance order by distance",nativeQuery = true)
	List<Store> getCloser(@Param("latitude") String latitude,@Param("longitude") String longitude,@Param("distance") int distance);

}


