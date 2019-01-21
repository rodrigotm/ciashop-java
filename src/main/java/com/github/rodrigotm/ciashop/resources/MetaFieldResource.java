package com.github.rodrigotm.ciashop.resources;

import java.util.List;

import com.github.rodrigotm.ciashop.helpers.Json;
import com.github.rodrigotm.ciashop.helpers.request.Request;
import com.github.rodrigotm.ciashop.helpers.request.RequestError;
import com.github.rodrigotm.ciashop.models.Customer;
import com.github.rodrigotm.ciashop.models.MetaField;
import com.github.rodrigotm.ciashop.models.Response;
import com.github.rodrigotm.ciashop.models.filters.CustomerFilter;
import com.github.rodrigotm.ciashop.models.filters.MetaFieldFilter;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;

/**
 *
 * @author rodrigoteixeira
 *
 */
public class MetaFieldResource {

	public final static String RESOURCE_V1 = "api/v1/metafields";

	/**
	 *
	 * Insert one Metafield.
	 *
	 * @param metaField
	 *            the MetaField object filled with required fields
	 * @return Case success, the return will be the Response Object, else will throw RequestError.
	 * @throws RequestError
	 *             throw RequestError
	 */
	public static Response insert(MetaField metaField) throws RequestError {

		try {
			Request request = Request.resource(RESOURCE_V1).method(HttpMethods.POST).body(Json.toString(metaField));
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJson(response.parseAsString(), Response.class);
			}

			throw new RequestError(response.getStatusCode());
		} catch (HttpResponseException e) {
			throw new RequestError(Json.parse(e.getContent()));
		} catch (Exception e) {
			throw new RequestError(e.getMessage());
		}
	}

	/**
	 *
	 * Find Metafields. You can filter Metafields by MetaFieldFilter
	 *
	 * <pre>
	 * {
	 * 	&#64;code
	 * 	MetaFieldFilter metaFieldFilter = new MetaFieldFilter();
	 * 	metaFieldFilter.setResource(ResourceEnum.COSTUMER.getValue());
	 * 	metaFieldFilter.setResourceId(99);
	 * 	metaFieldFilter.setKey("cro");
	 * 	MetaFieldResource.list(metaFieldFilter);
	 * }
	 * </pre>
	 *
	 * @param metaFieldFilter
	 *            the MetaFieldFilter object that you can fill fields for to filter
	 * @return Case success, the return will be ArrayList of MetaField, else will throw RequestError.
	 * @throws RequestError
	 *             throw RequestError
	 */
	public static List<MetaField> list(MetaFieldFilter metaFieldFilter) throws RequestError {
		try {
			Request request = Request.resource(RESOURCE_V1).method(HttpMethods.GET).addParamsFromObject(metaFieldFilter);
			HttpResponse response = request.send();

			if (response.isSuccessStatusCode()) {
				return Json.fromJsonList(response.parseAsString(), MetaField.class);
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
