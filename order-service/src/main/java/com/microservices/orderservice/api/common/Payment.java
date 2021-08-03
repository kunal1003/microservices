package com.microservices.orderservice.api.common;


public class Payment {

	private int paymentid;
	private String paymentstatus;
	public Payment(int paymentid, String paymentstatus, String transactionid) {
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
	private double amount;

	public Payment(int paymentid, String paymentstatus, String transactionid, int orderid, double amount) {
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Payment() {}
	
	
}
