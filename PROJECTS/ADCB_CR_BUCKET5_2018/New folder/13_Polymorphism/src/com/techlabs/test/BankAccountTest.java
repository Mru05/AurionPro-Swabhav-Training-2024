package com.techlabs.test;

import com.techlabs.model.BankAccount;
import com.techlabs.model.BankTransferPayment;
import com.techlabs.model.CreditCard;
import com.techlabs.model.PayPalPayment;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bankAcoount;
		// TODO Auto-generated method stub
		bankAcoount = new CreditCard();
		bankAcoount.processingPayment();
		bankAcoount.processingRefund();
		
		bankAcoount = new PayPalPayment();
		bankAcoount.processingPayment();
		bankAcoount.processingRefund();
		
		bankAcoount= new BankTransferPayment();
		bankAcoount.processingPayment();
		bankAcoount.processingRefund();
		

	}

}
