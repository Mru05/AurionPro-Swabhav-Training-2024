package com.techlabs.model;

public class BankTransferPayment extends BankAccount{

	@Override
	public double processingPayment() {
		// TODO Auto-generated method stub
		System.out.println("\nProcessing payment through Bank transfer....");
		return 0;
	}

	@Override
	public double processingRefund() {
		// TODO Auto-generated method stub
		System.out.println("Processing payment refund through refund....");
		return 0;
	}

}
