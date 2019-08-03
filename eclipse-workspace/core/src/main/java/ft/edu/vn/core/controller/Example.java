package ft.edu.vn.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ft.edu.vn.core.service.ExampleService;

@RestController
public class Example {

	//public ExampleService service;
	
	@RequestMapping("/")
	String home() {
		return "Hello World! xxxcccccccccccxxx " ;
	}

	

}