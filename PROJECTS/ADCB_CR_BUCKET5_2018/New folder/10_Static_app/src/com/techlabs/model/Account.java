package com.techlabs.model;

import java.util.Scanner;

public class Account {

	public static int numberofaccounts =0;
	public Account()
	{
		numberofaccounts++;
	}
	public static void getNumberOfAccounts()
	{
		return;
	}
  public static void main(String[] args) {
	  
      Account account2 = new Account();
      Account account3 = new Account();

      
    //  System.out.println("Number of BankAccount objects created: " + Account.getNumberOfAccounts());
}
}
