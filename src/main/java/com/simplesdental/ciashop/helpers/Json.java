package com.simplesdental.ciashop.helpers;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.simplesdental.ciashop.helpers.json.JsonUtils;

public class Json {
	private static final ObjectMapper defaultObjectMapper = JsonUtils.defaultMapper();
	private static volatile ObjectMapper objectMapper = null;

	public static <A> A fromJson(JsonNode json, Class<A> clazz) {
		try {
			return mapper().treeToValue(json, clazz);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static <T> T fromJson(String jsonString, Class<T> class1) {
		return Json.fromJson(Json.parse(jsonString), class1);
	}

	public static <T> List<T> fromJsonList(String jsonString, Class<T> class1) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, class1);
		return mapper.readValue(jsonString, type);
	}

	// Ensures that there always is *a* object mapper
	private static ObjectMapper mapper() {
		if (objectMapper == null) {
			return defaultObjectMapper;
		} else {
			return objectMapper;
		}
	}

	public static ObjectNode newObject() {
		return mapper().createObjectNode();
	}

	public static JsonNode parse(java.io.InputStream src) {
		try {
			return mapper().readValue(src, JsonNode.class);
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public static JsonNode parse(String src) {
		try {
			return mapper().readValue(src, JsonNode.class);
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public static void setObjectMapper(ObjectMapper mapper) {
		objectMapper = mapper;
	}

	public static String stringify(JsonNode json) {
		return json.toString();
	}

	public static JsonNode toJson(final Object data) {
		try {
			return mapper().valueToTree(data);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static String toString(Object object) {
		return Json.toJson(object).toString();
	}

}
