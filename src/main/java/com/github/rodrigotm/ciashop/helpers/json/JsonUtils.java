package com.github.rodrigotm.ciashop.helpers.json;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.github.rodrigotm.ciashop.helpers.json.deserializers.EnumDeserializer;
import com.github.rodrigotm.ciashop.helpers.json.serializers.DateSerializer;
import com.github.rodrigotm.ciashop.helpers.json.serializers.EnumSerializer;

public class JsonUtils {
	public static final ObjectMapper defaultMapper() {
		ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(Include.NON_NULL);
		SimpleModule module = new SimpleModule("EnumModule");
		module.addSerializer(Enum.class, new EnumSerializer());
		module.addDeserializer(Enum.class, new EnumDeserializer());
		module.addSerializer(Date.class, new DateSerializer());
		mapper.registerModule(module);
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		return mapper;
	}
}
