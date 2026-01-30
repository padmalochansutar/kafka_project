package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDeliveryBoyApplication {
    Map<string,Object>  map=new HashMap<>();
	private static final REST_URl="https://localhost:8080";


	public static void main(String[] args) {
		SpringApplication.run(KafkaDeliveryBoyApplication.class, args);
	}
 public void loadDataToCach(){
		System.out.println("Data store in cache");
     }

	 public static getData(String msg){
		 sysout("Hii Data");
}
	 public static getMsg(){
		 sysout("Hii");

	 }
	 public integer add(int a,int b){
		 return a+b;
	 }
}
