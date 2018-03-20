package com.simplesdental.ciashop.models;

import java.math.BigDecimal;

public class OrderItem {

	private Integer variantId;
	private BigDecimal price;
	private BigDecimal adjustedPrice;
	private Integer quantity;
	private String availability;

	public BigDecimal getAdjustedPrice() {
		return adjustedPrice;
	}

	public String getAvailability() {
		return availability;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Integer getVariantId() {
		return variantId;
	}

	public void setAdjustedPrice(BigDecimal adjustedPrice) {
		this.adjustedPrice = adjustedPrice;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setVariantId(Integer variantId) {
		this.variantId = variantId;
	}

}
