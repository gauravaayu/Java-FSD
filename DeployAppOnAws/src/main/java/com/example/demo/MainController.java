package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/")
	public String Hello() {
		
		return "Welcome to the Amazon EC2 Online Application!!!!!!";
	}

}
