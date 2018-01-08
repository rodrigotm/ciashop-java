package com.simplesdental.ciashop.resources;

import java.io.IOException;
import java.util.concurrent.Future;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.simplesdental.ciashop.helpers.Json;
import com.simplesdental.ciashop.helpers.request.Request;
import com.simplesdental.ciashop.helpers.request.RequestError;
import com.simplesdental.ciashop.models.IdentifyEvent;
import com.simplesdental.ciashop.models.TrackEvent;

/**
 * @author rodrigoteixeira
 *
 */
public class EventsResource {

	public final static String RESOURCE_V1 = "v1/event";

	/**
	 * @param identifyEvent
	 *            Object IdentifyEvent
	 * @return Future<HttpResponse>
	 */
	public static Future<HttpResponse> identify(IdentifyEvent identifyEvent) {
		try {
			Request request = Request.resource(RESOURCE_V1, true).method(HttpMethods.POST).body(Json.toString(identifyEvent));
			return request.sendAsync();

		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}

	/**
	 * @param trackEvent
	 *            Object trackEvent
	 * @return Future<HttpResponse>
	 */
	public static Future<HttpResponse> track(TrackEvent trackEvent) {
		try {
			Request request = Request.resource(RESOURCE_V1, true).method(HttpMethods.POST).body(Json.toString(trackEvent));
			return request.sendAsync();

		} catch (IOException e) {
			e.printStackTrace();
			throw new RequestError(e.getMessage());
		}
	}
}
