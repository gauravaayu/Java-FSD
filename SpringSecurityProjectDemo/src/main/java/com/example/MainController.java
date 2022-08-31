package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/home")
	public String home() {
		return "Welcome to the Home Page";
	}
	@GetMapping("/admin")
	public String admin() {
		return " Welcome to the Admin Page ";
	}

}
