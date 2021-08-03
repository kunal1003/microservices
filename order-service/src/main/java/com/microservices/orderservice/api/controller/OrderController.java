package com.microservices.orderservice.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.orderservice.api.common.Payment;
import com.microservices.orderservice.api.common.TransactionRequest;
import com.microservices.orderservice.api.common.TransactionResponse;
import com.microservices.orderservice.api.entity.Order;
import com.microservices.orderservice.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping("/bookorder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
		
		return service.saveOrder(request);
		
	}
	
}
