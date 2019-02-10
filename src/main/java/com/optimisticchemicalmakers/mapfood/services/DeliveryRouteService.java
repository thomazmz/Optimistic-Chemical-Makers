package com.optimisticchemicalmakers.mapfood.services;

import com.optimisticchemicalmakers.mapfood.models.DeliveryOrder;
import com.optimisticchemicalmakers.mapfood.models.DeliveryRoute;
import com.optimisticchemicalmakers.mapfood.models.Geolocation;
import com.optimisticchemicalmakers.mapfood.repositories.DeliveryRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    // Get Optimized Delivery Route
    public List<Geolocation> getOptimizedDeliveryRoute(DeliveryRoute deliveryRoute) {

        DeliveryOrder nextDeliveryOrder = null;

        List<DeliveryOrder> deliveryOrders = new ArrayList<>(deliveryRoute.getDeliveryOrders());

        List<Geolocation> optimizedRoute = new ArrayList<>();

        optimizedRoute.add(deliveryRoute.getStore());

        while (deliveryOrders.size() > 0) {

            for (int i = 0; i < deliveryOrders.size(); i++) {

                if (nextDeliveryOrder == null) {

                    nextDeliveryOrder = deliveryOrders.get(i);

                } else {

                    if ( nextDeliveryOrder.distanceTo(deliveryRoute.getStore()) > deliveryOrders.get(i).distanceTo(deliveryRoute.getStore())) {
                        nextDeliveryOrder = deliveryOrders.get(i);
                    }

                    deliveryOrders.get(i).distanceTo(deliveryRoute.getStore());

                    nextDeliveryOrder.distanceTo(deliveryRoute.getStore());

                }

            }

            optimizedRoute.add(nextDeliveryOrder);

            deliveryOrders.remove(nextDeliveryOrder);

            nextDeliveryOrder = null;

        }

        return optimizedRoute;

    }




}
