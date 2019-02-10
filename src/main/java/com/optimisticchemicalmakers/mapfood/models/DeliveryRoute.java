package com.optimisticchemicalmakers.mapfood.models;

import java.util.*;

import javax.persistence.*;

@Entity
public class DeliveryRoute {

    // Properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String protocol = UUID.randomUUID().toString().replace("-", "");

    @OneToMany(mappedBy="deliveryRoute", cascade = CascadeType.ALL)
    private List<DeliveryOrder> deliveryOrders;

    @ManyToOne
    @JoinColumn(name="store_id", nullable=false)
    private Store store;

    @OneToOne
    private DeliveryBoy deliveryBoy;

    private Date createdAt;

    private Date startedAt;

    private Date closedAt;

    // Constructors

    public DeliveryRoute(Store store) {
        this.store = store;
    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public String getProtocol() { return this.protocol; }

    public Store getStore() {
        return this.store;
    }

    public DeliveryBoy getDeliveryBoy() {
        return this.deliveryBoy;
    }

    public Date getCreatedAt() { return this.createdAt; }

    public Date getStartedAt() { return this.startedAt; }

    public Date getClosedAt() {
        return this.closedAt;
    }

    public List<DeliveryOrder> getDeliveryOrders() {
        return this.deliveryOrders;
    }
    public void assignDeliveryBoy(DeliveryBoy deliveryBoy) {
        // TO DO : Se o DeliveryBoy não está realizando outra entrega, pode associar.
        this.deliveryBoy = deliveryBoy;
    }

    public void addDeliveryOrder(DeliveryOrder deliveryOrder) {

        if (this.deliveryOrders == null ) {

            this.deliveryOrders = new ArrayList<DeliveryOrder>();
            this.deliveryOrders.add(deliveryOrder);

        } else if (this.deliveryOrders.size() <= 4) {

            this.deliveryOrders.add(deliveryOrder);

        } else {

            throw new RuntimeException();

        }
    }

    public void startDeliveryRoute() {
        this.startedAt = new Date();
    }

    public void closeDeliveryRoute() {
        // TO DO : Fecha a rota apenas se todas as entregas da rota estão finalizadas
        this.closedAt = new Date();

    }

}