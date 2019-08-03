package spring.ft.edu.vn.core.service;

import org.springframework.beans.factory.annotation.Autowired;

import spring.ft.edu.vn.core.config.AppConfigProperties;

public class MyService {
	private final AppConfigProperties properties;

	@Autowired
	public MyService(AppConfigProperties properties) {
	    this.properties = properties;
	}

	public AppConfigProperties getProperties() {
		return properties;
	}

	
	
}
