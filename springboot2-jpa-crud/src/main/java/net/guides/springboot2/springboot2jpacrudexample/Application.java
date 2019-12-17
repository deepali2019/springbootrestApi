package net.guides.springboot2.springboot2jpacrudexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Application {
	@GetMapping("/")
	public String login() {
		return "authenticated successfully";
	}
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
