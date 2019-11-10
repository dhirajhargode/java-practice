package com.nit.sb.apps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "<h1>Welcome to Spring Boot</h1>";
	}
}
