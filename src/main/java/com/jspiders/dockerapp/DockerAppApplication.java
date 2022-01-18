package com.jspiders.dockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerAppApplication.class, args);
	}
	
	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		return "Welcome to Docker";
	}

}
