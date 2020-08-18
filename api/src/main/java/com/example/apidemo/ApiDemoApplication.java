package com.example.apidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiDemoApplication {

	@GetMapping
	public String test() {
		return "ok";
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiDemoApplication.class, args);
	}
}
