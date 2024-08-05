package com.techlabs.behvioural.observer.model;

public interface INotifier {
	
	  void notify(Account account, String transactionType, double amount);

}
