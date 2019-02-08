package com.OptimisticChemicalMakers.MapFood.models;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.LinkedHashMap;

@Entity
public class DeliveryRoute {

    // Properties

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(columnDefinition = "CHAR(32)")
    private String id;

    private LinkedHashMap<String, DeliveryOrder> deliveryOrders;

    private Store store;

    // Constructors

    public DeliveryRoute(Store store) {
        this.store = store;
    }

    // Methods

    public void addDeliveryPoint(DeliveryOrder deliveryOrder) {

        if (deliveryOrder.getId()   == this.store.getId()) {
            this.deliveryOrders.put(deliveryOrder.getId(), deliveryOrder);
        } else {
            throw new RuntimeException();
        }

    }

}
