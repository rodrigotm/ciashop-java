package com.github.rodrigotm.ciashop.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaField {

	private Integer id;
	private Date createdAt;
	private Date updatedAt;

	@JsonProperty("package")
	private String pkg;

	private String resource;
	private Integer resourceId;
	private String key;
	private String value;
	private String description;

	public Date getCreatedAt() {
		return createdAt;
	}

	public String getDescription() {
		return description;
	}

	public Integer getId() {
		return id;
	}

	public String getKey() {
		return key;
	}

	public String getPkg() {
		return pkg;
	}

	public String getResource() {
		return resource;
	}

	public Integer getResourceId() {
		return resourceId;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public String getValue() {
		return value;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setPkg(String pkg) {
		this.pkg = pkg;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
