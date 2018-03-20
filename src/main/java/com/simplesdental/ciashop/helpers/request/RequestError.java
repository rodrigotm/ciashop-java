package com.simplesdental.ciashop.helpers.request;

import com.fasterxml.jackson.databind.JsonNode;
import com.simplesdental.ciashop.helpers.Json;
import com.simplesdental.ciashop.models.ContentError;

public class RequestError extends Error {

	private static final long serialVersionUID = 1L;

	private String message = null;
	private ContentError contentError = null;

	public RequestError(int statusCode) {
		if (statusCode == 400) {
			this.message = "Algum parâmetro informado não é válido";
		} else if (statusCode == 401) {
			this.message = "API Key da conta não é válida";
		} else if (statusCode == 404) {
			this.message = "Objeto não encontrado";
		} else if (statusCode == 408) {
			this.message = "Tempo de resposta do servidor excedeu o limite";
		} else if (statusCode == 409) {
			this.message = "Já existe um objeto com esses dados";
		} else if (statusCode == 415) {
			this.message = "Nenhum arquivo foi encontrado na requisição";
		} else if (statusCode == 500) {
			this.message = "Erro no processamento";
		}
	}

	public RequestError(JsonNode json) {
		this.contentError = Json.fromJson(json, ContentError.class);
	}

	public RequestError(String message) {
		this.message = message;
	}

	public ContentError getContentError() {
		return this.contentError;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
