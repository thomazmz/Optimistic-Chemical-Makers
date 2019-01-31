package com.OptimisticChemicalMakers.MapFood.repositories;

import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface DeliveryOrderRepository extends CrudRepository<DeliveryOrder, Long> {
}