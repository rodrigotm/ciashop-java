package com.simplesdental.ciashop.models.enums;

public enum ResourceEnum {

	COSTUMER("customer"), PRODUCT("product"), ORDER("order");

	private final String value;

	ResourceEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
