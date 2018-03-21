package com.github.rodrigotm.ciashop.models;

import java.math.BigDecimal;
import java.util.List;

public class Order {

	private List<OrderItem> orderItems;
	private BigDecimal subTotal;
	private ShippingMethod shippingMethod;
	private ShippingAddress shippingAddress;
	private Integer customerId;
	private Billing billing;
	private String ip;
	private Marketplace marketplace;
	private String statusMsgCustomer;
	private String statusMsgStore;

	public Billing getBilling() {
		return billing;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public String getIp() {
		return ip;
	}

	public Marketplace getMarketplace() {
		return marketplace;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public ShippingMethod getShippingMethod() {
		return shippingMethod;
	}

	public String getStatusMsgCustomer() {
		return statusMsgCustomer;
	}

	public String getStatusMsgStore() {
		return statusMsgStore;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void setMarketplace(Marketplace marketplace) {
		this.marketplace = marketplace;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public void setShippingMethod(ShippingMethod shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public void setStatusMsgCustomer(String statusMsgCustomer) {
		this.statusMsgCustomer = statusMsgCustomer;
	}

	public void setStatusMsgStore(String statusMsgStore) {
		this.statusMsgStore = statusMsgStore;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

}
