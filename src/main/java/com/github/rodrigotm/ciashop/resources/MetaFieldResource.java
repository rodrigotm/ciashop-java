package com.github.rodrigotm.ciashop.resources;

import com.github.rodrigotm.ciashop.helpers.Json;
import com.github.rodrigotm.ciashop.helpers.request.Request;
import com.github.rodrigotm.ciashop.helpers.request.RequestError;
import com.github.rodrigotm.ciashop.models.MetaField;
import com.github.rodrigotm.ciashop.models.Response;
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

}
