package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDeliveryBoyApplication {
	private static final REST_URl="https://localhost:8080";

	public static void main(String[] args) {
		SpringApplication.run(KafkaDeliveryBoyApplication.class, args);
	}

}
