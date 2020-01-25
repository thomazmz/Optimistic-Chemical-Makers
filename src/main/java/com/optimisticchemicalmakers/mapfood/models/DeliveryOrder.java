package com.optimisticchemicalmakers.mapfood.models;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity(name = "DeliveryOrder")
@Table(name = "deliveryOrder")
public class DeliveryOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String protocol = UUID.randomUUID().toString().replace("-", "");

    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
    private Store store;

    @OneToMany(mappedBy = "deliveryOrder", cascade = CascadeType.ALL)
    private Set<DeliveryItem> deliveryItems;

}
