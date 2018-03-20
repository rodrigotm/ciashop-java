package com.simplesdental.ciashop.models;

import java.math.BigDecimal;

public class ShippingMethod {

	private Integer gatewayId;
	private Integer id;
	private String name;
	private String deliveryDeadline;
	private BigDecimal cost;
	private BigDecimal adjustedCost;
	private BigDecimal fees;
	private Integer minDeliveryDeadline;
	private Integer maxDeliveryDeadline;
	private BigDecimal total;

	public BigDecimal getAdjustedCost() {
		return adjustedCost;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public String getDeliveryDeadline() {
		return deliveryDeadline;
	}

	public BigDecimal getFees() {
		return fees;
	}

	public Integer getGatewayId() {
		return gatewayId;
	}

	public Integer getId() {
		return id;
	}

	public Integer getMaxDeliveryDeadline() {
		return maxDeliveryDeadline;
	}

	public Integer getMinDeliveryDeadline() {
		return minDeliveryDeadline;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setAdjustedCost(BigDecimal adjustedCost) {
		this.adjustedCost = adjustedCost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public void setDeliveryDeadline(String deliveryDeadline) {
		this.deliveryDeadline = deliveryDeadline;
	}

	public void setFees(BigDecimal fees) {
		this.fees = fees;
	}

	public void setGatewayId(Integer gatewayId) {
		this.gatewayId = gatewayId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMaxDeliveryDeadline(Integer maxDeliveryDeadline) {
		this.maxDeliveryDeadline = maxDeliveryDeadline;
	}

	public void setMinDeliveryDeadline(Integer minDeliveryDeadline) {
		this.minDeliveryDeadline = minDeliveryDeadline;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
