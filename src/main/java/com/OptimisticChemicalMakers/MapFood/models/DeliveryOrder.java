package com.OptimisticChemicalMakers.MapFood.models;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class DeliveryOrder extends Geolocation {

    // Class Properties

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(columnDefinition = "CHAR(32)")
    private String id;

    @ManyToOne
    @JoinColumn(name="store_id", nullable=false)
    private Store store;

    @OneToMany(mappedBy="deliveryOrder", cascade = CascadeType.ALL)
    private Set<DeliveryItem> deliveryItems;

    private Date acceptedByStoreAt;

    private Date acceptedByDeliveryBoyAt;

    private Date deliveredAt;

    // Constructors

    public DeliveryOrder(){

    }

    // Getters

    public String getId() {
        return this.id;
    }

    public Store getStore() {
        return this.store;
    }

    public Set<DeliveryItem> getDeliveryItems() {
        return this.deliveryItems;
    }

    // Setters

    public void setStore(Store store) {
        this.store = store;
    }

    public void setDeliveryItems(Set<DeliveryItem> deliveryItems) {
        this.deliveryItems = deliveryItems;
    }


}