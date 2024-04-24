package com.info.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {
	
	@GetMapping("/message")
	public String message() {
		return "Welcome to DevopsIntegrationApplication demo!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}
