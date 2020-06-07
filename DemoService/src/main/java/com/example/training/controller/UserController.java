package com.example.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping(value = "/available")
	public String available() {
		return "Spring in Action";
	}

	@GetMapping("/demo")
	public String greeting() {
		return "Greeting";
	}
}
