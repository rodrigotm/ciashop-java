package com.github.rodrigotm.ciashop.helpers.request;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Future;

import org.apache.commons.lang3.StringUtils;

import com.github.rodrigotm.ciashop.helpers.Json;
import com.github.rodrigotm.ciashop.helpers.request.RequestContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.MultipartContent;
import com.google.api.client.http.javanet.NetHttpTransport;

public class Request {
	public static HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
	
	public static String createResourceUri(String resource) {
		return path(getEndpoint(), resource);
	}

	public static String getEndpoint() {
		return CiashopCredentials.endpoint;
	}

	public static Request openResource(String resource) throws IOException {
		return new Request(resource);
	}

	public static String path(Object origin, Object... dest) {
		StringBuffer sb = new StringBuffer(origin.toString());
		for (Object object : dest) {
			sb.append("/" + object);
		}
		return sb.toString();
	}

	public static Request resource() throws IOException {
		return resource("");
	}

	public static Request resource(String resource) throws IOException {
		return new Request(resource);
	}

	private HttpRequest request;
	private GenericUrl url;

	private Request(String resource) throws IOException {
		this.url = new GenericUrl(createResourceUri(resource));
		this.request = HTTP_TRANSPORT.createRequestFactory().buildGetRequest(this.url);
		auth(getToken());
	}

	public Request addParam(String key, Object value) throws IOException {
		this.url.set(key, value);
		return this;
	}
	
	private String getToken() {
		return CiashopCredentials.bearerToken;
	}
	
	@SuppressWarnings("unchecked")
	public Request addParamsFromObject(Object object) throws IOException {
		HashMap<String, Object> hash = Json.fromJson(Json.toJson(object), HashMap.class);
		hash.forEach((k,v) ->  this.url.set(k, v));
		return this;
	}

	public Request addHeader(String fieldName, Object value) {
		HttpHeaders h = new HttpHeaders();
		h.set(fieldName, value);
		this.request.setHeaders(h);
		return this;
	}

	public Request auth(String bearerToken) {
		this.request.getHeaders().setAuthorization(bearerToken);
		return this;
	}

	public Request body() {
		this.request.setContent(null);
		return this;
	}

	public Request body(String content) {
		this.request.setContent(new RequestContent(content));
		return this;
	}

	public Request method(String method) {
		this.request.setRequestMethod(method);

		if (method.equals(HttpMethods.GET)) {
			this.request.setContent(null);
		}

		return this;
	}

	public Request multipartContentBody(MultipartContent content) {
		this.request.setContent(content);
		return this;
	}

	public HttpResponse send() throws IOException {
		return this.request.execute();
	}

	public Future<HttpResponse> sendAsync() throws IOException {
		return this.request.executeAsync();
	}

}
