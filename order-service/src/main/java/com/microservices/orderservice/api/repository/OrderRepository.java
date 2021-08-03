package com.microservices.orderservice.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.orderservice.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

	
	
	
}
