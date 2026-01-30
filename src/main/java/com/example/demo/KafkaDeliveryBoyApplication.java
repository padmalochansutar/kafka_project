package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDeliveryBoyApplication {
    Map<string,Object>  map=new HashMap<>();
	public static void main(String[] args) {
		SpringApplication.run(KafkaDeliveryBoyApplication.class, args);
	}
 public void loadDataToCach(){
		System.out.println("Data store in cache");
     }
}
