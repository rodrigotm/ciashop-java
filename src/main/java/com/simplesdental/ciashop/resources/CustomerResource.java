package com.simplesdental.ciashop.resources;

import java.util.List;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.simplesdental.ciashop.helpers.Json;
import com.simplesdental.ciashop.helpers.request.Request;
import com.simplesdental.ciashop.helpers.request.RequestError;
import com.simplesdental.ciashop.models.Customer;
import com.simplesdental.ciashop.models.filters.CustomerFilter;


/**
 * 
 * @author rodrigoteixeira
 *
 */
public class CustomerResource {

	public final static String RESOURCE_V1 = "api/v1/customers";

	/**
	 * 
	 * @param customerFilter
	 * @return List<Customer>
	 */
	public static List<Customer> list(CustomerFilter customerFilter) {
		try {
			Request request = Request.resource(RESOURCE_V1).method(HttpMethods.GET).addParamsFromObject(customerFilter);
			HttpResponse response = request.send();
			
			if(response.isSuccessStatusCode()) {
				return Json.fromJsonList(response.parseAsString(), Customer.class);
			}
			
			throw new RequestError(response.parseAsString());
		} catch (Exception e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

}
