package com.simplesdental.ciashop.helpers.request;

public class RequestAuth {
	public String bearerToken = "";
	public String subDomainAPI = "";

	public RequestAuth(String bearerToken, String subDomainAPI) {
		this.bearerToken = bearerToken;
		this.subDomainAPI = subDomainAPI;
	}
}
