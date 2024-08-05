package com.techlabs.behvioural.observer.model;

public class WhatsappNotifier implements INotifier{

	 @Override
	    public void notify(Account account, String transactionType, double amount) {
	        System.out.println("Whatsapp: " + amount + " has been " + transactionType + ". Your account balance is " + account.getBalance());
	    }

}
