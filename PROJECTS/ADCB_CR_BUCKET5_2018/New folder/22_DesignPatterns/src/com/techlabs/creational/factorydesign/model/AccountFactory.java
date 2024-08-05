package com.techlabs.creational.factorydesign.model;

public class AccountFactory {
	public static IAccount makeAccount(String Account) {
		
		IAccount account = null;
		if(Account == "Saving")
			account = new SavingAccount(0);
		if(Account == "Current")
			account = new CurrentAccount(0);
		
		
		return account;
		
		
	}

}
