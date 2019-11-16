package com.javatechie.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloServiceApplication {

	@GetMapping("/home")
	public String message(){
		return "Hello-service working !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceApplication.class, args);
	}

}
