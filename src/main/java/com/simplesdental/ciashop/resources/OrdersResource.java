package com.simplesdental.ciashop.resources;

import java.io.IOException;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.simplesdental.ciashop.helpers.Json;
import com.simplesdental.ciashop.helpers.request.Request;
import com.simplesdental.ciashop.helpers.request.RequestError;
import com.simplesdental.ciashop.models.Order;
import com.simplesdental.ciashop.models.Response;

/**
 * @author rodrigoteixeira
 *
 */
public class OrdersResource {

	public final static String RESOURCE_V1 = "api/v1/orders";

	public static Response insert(Order order) throws RequestError {

		try {
			Request request = Request.resource(RESOURCE_V1).method(HttpMethods.POST).body(Json.toString(order));
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), Response.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (HttpResponseException e) {
			throw new RequestError(Json.parse(e.getContent()));
		} catch (IOException e) {
			throw new RequestError(e.getMessage());
		}
	}
}
