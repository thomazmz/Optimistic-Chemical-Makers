package com.optimisticchemicalmakers.mapfood.dtos;

public class DeliveryItemDto {

    // Class Properties

    private String protocol;

    private String productProtocol;

    private String deliveryOrderProtocol;

    private Integer quantity;

    // Constructor

    public DeliveryItemDto() {
    }

	public String getProtocol() {
		return this.protocol;
	}

	public String getProductProtcol() {
		return this.productProtocol;
	}

	public String getDeliveryOrderProtocol() {
		return this.deliveryOrderProtocol;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public void setProtuctProtocol(String productProtocol) {
		this.productProtocol = productProtocol;
	}

	public void setDeliveryOrderProtocol(String deliveryOrderProtocol) {
		this.deliveryOrderProtocol = deliveryOrderProtocol;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
