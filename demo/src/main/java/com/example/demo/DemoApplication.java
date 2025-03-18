package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The DemoApplication class serves as the entry point for the Spring Boot application.
 * It contains the main method which bootstraps and starts the Spring application context.
 *
 * This class is annotated with @SpringBootApplication, which is a convenience annotation
 * that adds:
 d.
 *
 * The main method in this class invokes SpringApplication.run to start the application.
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
