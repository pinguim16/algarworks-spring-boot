package com.example.algamoney.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.algamoney.api.config.property.AlgarmoneyApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(AlgarmoneyApiProperty.class)
public class AlgarmoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgarmoneyApiApplication.class, args);
	}
}
