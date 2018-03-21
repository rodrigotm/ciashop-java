package com.github.rodrigotm.ciashop.models.enums;

public enum PackageEnum {

	SYSTEM("system");

	private final String value;

	PackageEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
