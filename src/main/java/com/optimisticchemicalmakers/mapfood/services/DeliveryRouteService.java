package com.optimisticchemicalmakers.mapfood.services;

import com.optimisticchemicalmakers.mapfood.repositories.DeliveryRouteRepository;
import com.optimisticchemicalmakers.mapfood.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryRouteService {

    // -----------------------------------------------------------------------------------------------------------------
    // Repository (Manter no máximo um Repository por service)
    // -----------------------------------------------------------------------------------------------------------------

    @Autowired
    private DeliveryRouteRepository deliveryRouteRepository;

    // -----------------------------------------------------------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------------------------------------------------------



}
