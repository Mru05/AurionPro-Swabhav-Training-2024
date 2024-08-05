package com.techlabs.model;

public class PayPalPayment extends BankAccount{

	@Override
	public double processingPayment() {
		// TODO Auto-generated method stu
		System.out.println("\nProcessing payment through PayPal....");
		return 0;
	}

	@Override
	public double processingRefund() {
		// TODO Auto-generated method stub
		System.out.println("Processing payment refund through paypal....");
		return 0;
	}

}
