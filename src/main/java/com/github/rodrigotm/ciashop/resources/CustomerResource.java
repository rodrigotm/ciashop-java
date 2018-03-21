package com.github.rodrigotm.ciashop.resources;

import java.util.List;

import com.github.rodrigotm.ciashop.helpers.Json;
import com.github.rodrigotm.ciashop.helpers.request.Request;
import com.github.rodrigotm.ciashop.helpers.request.RequestError;
import com.github.rodrigotm.ciashop.models.Customer;
import com.github.rodrigotm.ciashop.models.filters.CustomerFilter;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;

/**
 *
 * @author rodrigoteixeira
 *
 */
public class CustomerResource {

	public final static String RESOURCE_V1 = "api/v1/customers";

	/**
	 *
	 * Find customers. You can filter customers by CustomerFilter
	 *
	 * <pre>
	 * {
	 * 	&#64;code
	 * 	CustomerFilter customerFilter = new CustomerFilter();
	 * 	customerFilter.setDocumentID(12345678909);
	 * 	CustomerResource.list(customerFilter);
	 * }
	 * </pre>
	 *
	 * @param customerFilter
	 *            the CustomerFilter object that you can fill fields for to filter
	 * @return Case success, the return will be ArrayList of Customer, else will throw RequestError.
	 * @throws RequestError
	 *             throw RequestError
	 */
	public static List<Customer> list(CustomerFilter customerFilter) throws RequestError {
		try {
			Request request = Request.resource(RESOURCE_V1).method(HttpMethods.GET).addParamsFromObject(customerFilter);
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJsonList(response.parseAsString(), Customer.class);
			}

			throw new RequestError(response.parseAsString());
		} catch (HttpResponseException e) {
			throw new RequestError(Json.parse(e.getContent()));
		} catch (Exception e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

}
