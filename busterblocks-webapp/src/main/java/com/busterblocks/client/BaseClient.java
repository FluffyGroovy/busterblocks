package com.busterblocks.client;

import org.springframework.ws.client.core.WebServiceOperations;

public abstract class BaseClient {

	private WebServiceOperations service;

	protected WebServiceOperations getService() {
		return service;
	}

	public void setService(WebServiceOperations service) {
		this.service = service;
	}

}
