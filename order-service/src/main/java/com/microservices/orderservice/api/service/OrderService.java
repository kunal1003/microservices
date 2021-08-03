package com.microservices.orderservice.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.orderservice.api.common.Payment;
import com.microservices.orderservice.api.common.TransactionRequest;
import com.microservices.orderservice.api.common.TransactionResponse;
import com.microservices.orderservice.api.entity.Order;
import com.microservices.orderservice.api.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;	
	
	@Autowired
	private RestTemplate template;

	public TransactionResponse saveOrder(TransactionRequest request) {
		
		String response="";
		Order order=request.getOrder();
		Payment payment=request.getPayment();
		payment.setOrderid(order.getId());
		payment.setAmount(order.getPrice());
		  
		Payment paymentresponse = template.postForObject("http://payment-service/payment/dopayment", payment, Payment.class);
		
		 response= paymentresponse.getPaymentstatus().equals("success")?"payment proccessing successful": "failed order adding to cart" ;
		
		 repository.save(order);
		 return new TransactionResponse(order,paymentresponse.getAmount(),paymentresponse.getTransactionid(),response);
		
	}

}
