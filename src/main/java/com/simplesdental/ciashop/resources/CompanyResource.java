package com.simplesdental.ciashop.resources;

import java.io.IOException;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.simplesdental.ciashop.helpers.Json;
import com.simplesdental.ciashop.helpers.request.Request;
import com.simplesdental.ciashop.helpers.request.RequestAuth;
import com.simplesdental.ciashop.helpers.request.RequestError;
import com.simplesdental.ciashop.models.Company;

public class CompanyResource {

	public final static String RESOURCE_V1 = "v1/company";

	public static Company create(RequestAuth auth, Company company) {
		try {
			Request request = Request.resource(RESOURCE_V1).method(HttpMethods.POST).auth(auth).body(Json.toString(company));
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), Company.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static Company update(RequestAuth auth, String idCompany, Company company) {
		try {

			String resource = Request.path(RESOURCE_V1, idCompany);

			Request request = Request.resource(resource).method(HttpMethods.PATCH).auth(auth).body(Json.toString(company));
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), Company.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	public static HttpResponse delete(RequestAuth auth, String idCompany) {
		try {

			String resource = Request.path(RESOURCE_V1, idCompany);

			Request request = Request.resource(resource).method(HttpMethods.POST).auth(auth);
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return response;
			}

			throw new RequestError(response.getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

}