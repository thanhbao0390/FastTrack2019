package spring.ft.edu.vn.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.ft.edu.vn.core.config.AppConfigProperties;

@RestController
public class Example {
	
	//MyService service = new MyService(properties);
	
	@Autowired
	AppConfigProperties properties;
	
	@GetMapping(value = "/")
	public String hone() {
		return "Hello w" + properties.getName() + properties.getDescription();
	}
	
	@GetMapping(value = "/error")
	public String error() {
		return "Error w";
	}
}
