package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;

@Entity
public class DeliveryItem {

    // Class Properties

    @Id                                                     // It tells the JPA that it is an ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // It tells the JPA how to autogenerate the ID value
    private Long id;

    @ManyToOne
    @JoinColumn(name="product_id", nullable=false)
    private Product product;

    @ManyToOne
    @JoinColumn(name="delivery_order_id", nullable=false)
    private DeliveryOrder deliveryOrder;

    private Integer quantity;

    // Constructor

    public DeliveryItem(){

    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public DeliveryOrder getDeliveryOrder() {
        return this.deliveryOrder;
    }

    public Product getProduct(){
        return this.product;
    }

    // Setters

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setDeliveryOrder(DeliveryOrder deliveryOrder) {
        this.deliveryOrder = deliveryOrder;
    }

}