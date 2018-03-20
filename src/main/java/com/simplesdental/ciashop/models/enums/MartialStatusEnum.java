package com.simplesdental.ciashop.models.enums;

public enum MartialStatusEnum {

	DIVORCED("divorced"), MARRIED("married"), SEPARATED("separated"), WINDOWER("widower"), COMMMON_LAW_MARRIAGE("commonLawMarriage"), LEGALLY_SEPARATED("legallySeparated");

	private final String value;

	MartialStatusEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
