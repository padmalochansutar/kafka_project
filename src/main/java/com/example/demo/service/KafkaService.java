package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.configuration.AppConstants;

@Service
public class KafkaService {
	//this is used for datafor meassage
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public Boolean updateLocation(String location) {
		this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
		return true;
		
	}

}
