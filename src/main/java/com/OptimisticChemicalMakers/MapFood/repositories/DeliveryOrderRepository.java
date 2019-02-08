package com.OptimisticChemicalMakers.MapFood.repositories;

import com.OptimisticChemicalMakers.MapFood.models.DeliveryOrder;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DeliveryOrderRepository extends CrudRepository<DeliveryOrder, Long> {

	List<DeliveryOrder> findByPreparedAtIsNull();
}