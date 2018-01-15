package com.simplesdental.ciashop.test.utils;

import com.google.api.client.testing.http.MockLowLevelHttpRequest;

public class BearerAuth {

	public static Boolean isAuthenticated(MockLowLevelHttpRequest httpRequest, String bearerToken) {
		String basicHeader = httpRequest.getHeaders().get("authorization").get(0).toString();
		return basicHeader.equals(bearerToken);
	}
}
