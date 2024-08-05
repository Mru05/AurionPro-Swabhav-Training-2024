package com.techlabs.test;

import com.techlabs.model.BankAccount;
import com.techlabs.model.BankTransferPayment;
import com.techlabs.model.CreditCard;
import com.techlabs.model.PayPalPayment;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount;
		bankAccount = new CreditCard();
		bankAccount.processingPayment();
		bankAccount.processingRefund();
		
		bankAccount = new PayPalPayment();
		bankAccount.processingPayment();
		bankAccount.processingRefund();
		
		bankAccount= new BankTransferPayment();
		bankAccount.processingPayment();
		bankAccount.processingRefund();


	}

}
