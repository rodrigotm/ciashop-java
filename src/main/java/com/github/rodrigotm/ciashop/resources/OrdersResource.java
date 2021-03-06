package com.github.rodrigotm.ciashop.resources;

import java.io.IOException;

import com.github.rodrigotm.ciashop.helpers.Json;
import com.github.rodrigotm.ciashop.helpers.request.Request;
import com.github.rodrigotm.ciashop.helpers.request.RequestError;
import com.github.rodrigotm.ciashop.models.Order;
import com.github.rodrigotm.ciashop.models.Response;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;

/**
 * @author rodrigoteixeira
 *
 */
public class OrdersResource {

	public final static String RESOURCE_V1 = "api/v1/orders";

	/**
	 *
	 * Insert one Order.
	 *
	 * @param order
	 *            the Order object filled with required fields
	 * @return Case success, the return will be the Response Object, else will throw RequestError.
	 * @throws RequestError
	 *             throw RequestError
	 */
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
