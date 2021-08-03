package com.microservices.paymentservice.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.paymentservice.api.entity.PaymentEntity;
import com.microservices.paymentservice.api.repository.PaymentRepository;

@Service
public class PaymentService {

	
	@Autowired
	private PaymentRepository repository;
	
	public PaymentEntity doPayment(PaymentEntity payment) {
		
		
		
		payment.setPaymentstatus(paymentProcessing());
		payment.setTransactionid(UUID.randomUUID().toString());

		System.out.println(+payment.getPaymentid()+" "+ payment.getPaymentstatus()+" "+payment.getTransactionid());
		return repository.save(payment);
	}
	
	
	public String paymentProcessing() {
		
		 return	new Random().nextBoolean()?"success" : "false" ;
			
		}


	public PaymentEntity findPaymentHistoryByOrderId(int orderid) {
		// TODO Auto-generated method stub
		return repository.findByorderid(orderid);
	}
}
