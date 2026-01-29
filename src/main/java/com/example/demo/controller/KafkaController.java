package com.example.demo.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.KafkaService;

@RestController
@RequestMapping("/location")
public class KafkaController {
	
	private KafkaService kafkaService;
	
	public ResponseEntity<?> updateLocation(){
		  System.out.println("Kafka");
		
		 kafkaService.updateLocation("("+Math.round(Math.random()*100) +" ,"+Math.round(Math.random()*100) +")");
		 return new ResponseEntity<>(Map.of("message", "location updated"),HttpStatus.OK);
	}
	
		

}
