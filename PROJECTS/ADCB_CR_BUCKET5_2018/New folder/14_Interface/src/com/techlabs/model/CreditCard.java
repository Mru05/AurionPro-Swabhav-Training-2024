package com.techlabs.model;

public class CreditCard implements BankAccount {

	@Override
	public double processingPayment() {
		// TODO Auto-generated method stub
		System.out.println("Processing payment through credit card....");
		return 0;
	}

	@Override
	public double processingRefund() {
		// TODO Auto-generated method stub
		System.out.println("Processing payment refund through creditcard....");
		return 0;
	}
}
