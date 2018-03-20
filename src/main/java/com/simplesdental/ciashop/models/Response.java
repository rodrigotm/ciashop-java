package com.simplesdental.ciashop.models;

public class Response {

	private Integer id;
	private String url;
	private String resource;

	public Integer getId() {
		return id;
	}

	public String getResource() {
		return resource;
	}

	public String getUrl() {
		return url;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
