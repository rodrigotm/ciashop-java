package com.github.rodrigotm.ciashop.models;

public class TemplateRegister {

	private Integer id;
	private String name;
	private boolean deleted;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
