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

    public List<Geolocation> getOptimizedDeliveryRoute(DeliveryRoute deliveryRoute) {

        // TO DO : Calcula melhor rota entre as deliveryOrders;
        // TO DO : Retorna uma ArrayList no qual o index representa a posição do ponto na rota
        // OBS1  : O restaurante sempre será o ponto zero;
        // OBS2  : Se houverem somente uma deliveryOrder só há uma possibilidade de retorno;
        // OBS1  : Uma DeliveryRoute pode conter de 1 a até 5 DeliveryOrders;

        DeliveryOrder nextDeliveryOrder = null;

        List<DeliveryOrder> deliveryOrders = new ArrayList<>(deliveryRoute.getDeliveryOrders());

        List<Geolocation> optimizedRoute = new ArrayList<>();

        optimizedRoute.add(deliveryRoute.getStore());

        while (deliveryOrders.size() > 0) {

            for (int i = 0; i < deliveryOrders.size(); i++) {

                if (deliveryOrders == null) {

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
