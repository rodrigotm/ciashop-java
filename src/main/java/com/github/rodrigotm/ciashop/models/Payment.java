package com.github.rodrigotm.ciashop.models;

import java.math.BigDecimal;

public class Payment {

	private Integer sequential;
	private String method;
	private BigDecimal value;
	private Integer installments;

	public Integer getInstallments() {
		return installments;
	}

	public String getMethod() {
		return method;
	}

	public Integer getSequential() {
		return sequential;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setInstallments(Integer installments) {
		this.installments = installments;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void setSequential(Integer sequential) {
		this.sequential = sequential;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
