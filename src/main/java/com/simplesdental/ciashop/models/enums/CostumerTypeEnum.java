package com.simplesdental.ciashop.models.enums;

public enum CostumerTypeEnum {
	PERSON("Person"), COMPANY("Company");

	private final String value;

	CostumerTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}