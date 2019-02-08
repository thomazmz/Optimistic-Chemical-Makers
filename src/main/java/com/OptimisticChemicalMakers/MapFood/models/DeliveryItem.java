package com.OptimisticChemicalMakers.MapFood.models;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class DeliveryItem {

    // Class Properties

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(columnDefinition = "CHAR(32)")
    private String id;

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

    public String getId() {
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
