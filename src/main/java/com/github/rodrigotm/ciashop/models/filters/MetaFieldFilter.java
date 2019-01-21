package com.github.rodrigotm.ciashop.models.filters;

import java.util.Date;

public class MetaFieldFilter {

	private Integer limit;
	private Integer page;
	private Integer minId;
	private Date minUpdateAt;
	private String fields;
	private String resource;
	private Integer resourceId;
	private String key;
	private String value;

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getMinId() {
		return minId;
	}

	public void setMinId(Integer minId) {
		this.minId = minId;
	}

	public Date getMinUpdateAt() {
		return minUpdateAt;
	}

	public void setMinUpdateAt(Date minUpdateAt) {
		this.minUpdateAt = minUpdateAt;
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
