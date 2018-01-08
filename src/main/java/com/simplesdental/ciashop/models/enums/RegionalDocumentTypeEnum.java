package com.simplesdental.ciashop.models.enums;

public enum RegionalDocumentTypeEnum {

	RG("RG"), IE("IE");

	private final String value;

	RegionalDocumentTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
