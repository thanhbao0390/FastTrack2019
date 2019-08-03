package sts.com.vn.autogen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sts.com.vn.autogen.service.InformationService;

@RestController
public class HomeController {

	@Autowired
	private InformationService service;

	@RequestMapping("/home")
	public String home() {

		service.getTables();

		return "Auto gen .....!";
	}
}