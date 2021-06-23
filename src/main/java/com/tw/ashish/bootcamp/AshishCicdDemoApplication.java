package com.tw.ashish.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AshishCicdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AshishCicdDemoApplication.class, args);
	}

	@GetMapping(value = "/")
	public String homepage() {
		return "<h1>My fancy homepage! More secured!!!</h1>";
	}
}
