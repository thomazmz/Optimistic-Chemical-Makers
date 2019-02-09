package com.optimisticchemicalmakers.mapfood.repositories;

import org.springframework.data.repository.CrudRepository;

import com.optimisticchemicalmakers.mapfood.models.DeliveryOrder;

import java.util.Date;
import java.util.List;

public interface DeliveryOrderRepository extends CrudRepository<DeliveryOrder, Long> {

}