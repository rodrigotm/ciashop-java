package com.simplesdental.ciashop.models;

import java.math.BigDecimal;

public class ShippingMethod {

	public Integer gatewayId;
	public Integer id;
	public String name;
	public String deliveryDeadline;
	public BigDecimal cost;
	public BigDecimal adjustedCost;
	public BigDecimal fees;
	public Integer minDeliveryDeadline;
	public Integer maxDeliveryDeadline;
	public BigDecimal total;

}
