package com.simplesdental.ciashop.resources;

import java.util.concurrent.Future;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.simplesdental.ciashop.helpers.Json;
import com.simplesdental.ciashop.helpers.request.Request;
import com.simplesdental.ciashop.helpers.request.RequestAuth;
import com.simplesdental.ciashop.helpers.request.RequestError;
import com.simplesdental.ciashop.models.Order;

/**
 * @author rodrigoteixeira
 *
 */
public class OrdersResource {

	public final static String RESOURCE_V1 = "/api/v1/orders";

	/**
	 * @param order
	 *            Object Order
	 * @return Future<HttpResponse>
	 */
	public static Future<HttpResponse> writeOrders(RequestAuth RequestAuth, Order order) {
		try {
			Request request = Request.resource(RESOURCE_V1).method(HttpMethods.POST).auth(RequestAuth).body(Json.toString(order));
			return request.sendAsync();

		} catch (Exception e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}
}
