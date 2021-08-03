package com.microservices.paymentservice.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_tb")
public class PaymentEntity {

	@Id
	@GeneratedValue
	private int paymentid;
	private String paymentstatus;
	public PaymentEntity(int paymentid, String paymentstatus, String transactionid) {
		super();
		this.paymentid = paymentid;
		this.paymentstatus = paymentstatus;
		this.transactionid = transactionid;
	}
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	private String transactionid; 
	private int orderid;
	private int amount;

	public PaymentEntity(int paymentid, String paymentstatus, String transactionid, int orderid, int amount) {
		super();
		this.paymentid = paymentid;
		this.paymentstatus = paymentstatus;
		this.transactionid = transactionid;
		this.orderid = orderid;
		this.amount = amount;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public PaymentEntity() {}
	
	
}
