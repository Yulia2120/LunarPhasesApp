package com.demo_with_spring.demo_with_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWithSpringApplication.class, args);
	}


}
