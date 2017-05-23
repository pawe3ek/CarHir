package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@EnableAutoConfiguration
@EntityScan({ "controllers", "service", "models" })

public class CarHirApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarHirApplication.class, args);
	}
}
