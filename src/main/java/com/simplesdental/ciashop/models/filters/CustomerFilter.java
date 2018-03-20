package com.simplesdental.ciashop.models.filters;

import java.util.Date;

public class CustomerFilter {

	private Integer limit;
	private Integer page;
	private Integer minId;
	private Date minUpdateAt;
	private String fields;
	private String email;
	private String documentID;

	public String getDocumentID() {
		return documentID;
	}

	public String getEmail() {
		return email;
	}

	public String getFields() {
		return fields;
	}

	public Integer getLimit() {
		return limit;
	}

	public Integer getMinId() {
		return minId;
	}

	public Date getMinUpdateAt() {
		return minUpdateAt;
	}

	public Integer getPage() {
		return page;
	}

	public void setDocumentID(String documentID) {
		this.documentID = documentID;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public void setMinId(Integer minId) {
		this.minId = minId;
	}

	public void setMinUpdateAt(Date minUpdateAt) {
		this.minUpdateAt = minUpdateAt;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

}
