package com.OptimisticChemicalMakers.MapFood.Services;

import com.optimisticchemicalmakers.mapfood.models.DeliveryOrder;
import com.optimisticchemicalmakers.mapfood.models.DeliveryRoute;
import com.optimisticchemicalmakers.mapfood.models.Geolocation;
import com.optimisticchemicalmakers.mapfood.models.Store;
import com.optimisticchemicalmakers.mapfood.services.DeliveryRouteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DeliveryRouteServiceTest {

    @InjectMocks
    DeliveryRouteService deliveryRouteService;

    @Test
    public void getOptimizedDeliveryRouteTrivial() {

        Store store = new Store(-30.026885, -51.190618);

        DeliveryOrder deliveryOrder1 = new DeliveryOrder(store,-30.022326, -51.194987);
        DeliveryOrder deliveryOrder2 = new DeliveryOrder(store,-30.019372, -51.186561);
        DeliveryOrder deliveryOrder3 = new DeliveryOrder(store,-30.011541, -51.193559);
        DeliveryOrder deliveryOrder4 = new DeliveryOrder(store,-30.011541, -51.193559);

        DeliveryRoute sample = new DeliveryRoute(store);
        sample.addDeliveryOrder(deliveryOrder3);
        sample.addDeliveryOrder(deliveryOrder2);
        sample.addDeliveryOrder(deliveryOrder1);
        sample.addDeliveryOrder(deliveryOrder4);

        List<Geolocation> responseReference = new ArrayList<>();
        responseReference.add(deliveryOrder1);
        responseReference.add(deliveryOrder2);
        responseReference.add(deliveryOrder3);
        responseReference.add(deliveryOrder4);

        List<Geolocation> response = deliveryRouteService.getOptimizedDeliveryRoute(sample);

        assertEquals(response, responseReference);

    }


}

