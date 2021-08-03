package com.microservices.orderservice.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.microservices.orderservice.api.common.Payment;
import com.microservices.orderservice.api.common.TransactionRequest;
import com.microservices.orderservice.api.entity.Order;

@SpringBootApplication
@EnableEurekaClient
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}
	
	
	@Bean
	@LoadBalanced
	public RestTemplate resttemplate() {
	
		return new RestTemplate();
	}
	
}
