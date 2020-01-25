package com.optimisticchemicalmakers.mapfood.models;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "DeliveryItem")
@Table(name = "deliveryItem")
public class DeliveryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String protocol = UUID.randomUUID().toString().replace("-", "");

    @ManyToOne
    @JoinColumn(name="product_id", nullable=false)
    private Product product;

    @ManyToOne
    @JoinColumn(name="delivery_order_id", nullable=false)
    private DeliveryOrder deliveryOrder;

    private Integer quantity;

}
