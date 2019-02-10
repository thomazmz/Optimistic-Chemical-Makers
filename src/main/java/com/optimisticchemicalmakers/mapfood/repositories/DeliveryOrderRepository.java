package com.optimisticchemicalmakers.mapfood.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.optimisticchemicalmakers.mapfood.models.DeliveryOrder;
import com.optimisticchemicalmakers.mapfood.models.Requestor;

public interface DeliveryOrderRepository extends CrudRepository<DeliveryOrder, Long> {

	List<DeliveryOrder> findByRequestor(Requestor requestor);

}