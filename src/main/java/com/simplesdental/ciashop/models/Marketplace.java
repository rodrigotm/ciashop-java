package com.simplesdental.ciashop.models;

import java.util.List;

public class Marketplace {

	private String name;
	private String store;
	private String orderId;
	private List<Payment> payments;

	public String getName() {
		return name;
	}

	public String getOrderId() {
		return orderId;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public String getStore() {
		return store;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public void setStore(String store) {
		this.store = store;
	}

}
