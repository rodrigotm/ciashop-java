package com.github.rodrigotm.ciashop.models.enums;

public enum DocumentTypeEnum {

	CPF("CPF"), CNPJ("CNPJ");

	private final String value;

	DocumentTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
