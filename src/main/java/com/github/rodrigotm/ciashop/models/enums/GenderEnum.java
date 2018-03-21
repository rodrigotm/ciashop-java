package com.github.rodrigotm.ciashop.models.enums;

public enum GenderEnum {

	MALE("Male"), FEMALE("Female");

	private final String value;

	GenderEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
