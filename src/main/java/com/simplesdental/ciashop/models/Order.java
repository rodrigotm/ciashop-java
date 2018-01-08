package com.simplesdental.ciashop.models;

import java.math.BigDecimal;
import java.util.List;

public class Order {

	public List<OrderItem> orderItems;
	public BigDecimal subTotal;
	public ShippingMethod shippingMethod;
	public ShippingAddress shippingAddress;
	public Integer customerId;
	public Billing billing;
	public String ip;
	public Marketplace marketplace;
}
