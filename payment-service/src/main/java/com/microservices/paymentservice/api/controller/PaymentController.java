package com.microservices.paymentservice.api.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.paymentservice.api.entity.PaymentEntity;
import com.microservices.paymentservice.api.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PaymentService service;
	
	
	@PostMapping("/dopayment")
	public PaymentEntity doPayment(@RequestBody PaymentEntity payment) {
		
		System.out.println("into controller");
		return service.doPayment(payment);
		
	}
	
	@GetMapping("/{orderId}")
	public PaymentEntity findPaymentHistoryByOrderId(int orderid) {
		
		return service.findPaymentHistoryByOrderId(orderid);
		
	}
	
}
