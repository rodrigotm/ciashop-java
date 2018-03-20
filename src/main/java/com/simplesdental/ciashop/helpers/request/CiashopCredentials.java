package com.simplesdental.ciashop.helpers.request;


public class CiashopCredentials {
	public static String bearerToken;
	public static String endpoint;

	public static void init(String bearerToken, String endpoint) {
		CiashopCredentials.bearerToken = bearerToken;
		CiashopCredentials.endpoint = endpoint;
	}
	
	
}
