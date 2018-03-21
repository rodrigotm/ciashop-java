package com.github.rodrigotm.ciashop.models.enums;

public enum CustomerTypeEnum {

	PERSON("person"), COMPANY("company");

	private final String value;

	CustomerTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
