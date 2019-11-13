package com.optimisticchemicalmakers.mapfood.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    @Column(nullable = false)
    private String uuid = UUID.randomUUID().toString().replace("-", "");
    
    private String description;

    private BigDecimal price;
    
    @ManyToOne
    @JoinColumn(name="store_id", nullable=false, referencedColumnName="id")
    private Store store;

}
