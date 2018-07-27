package com.edu.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootStarterExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootStarterExampleApplication.class, args);
	}
	
	@RequestMapping("/greet")
	private String greetings() {
		return "Hello World ";
		
	}
}
