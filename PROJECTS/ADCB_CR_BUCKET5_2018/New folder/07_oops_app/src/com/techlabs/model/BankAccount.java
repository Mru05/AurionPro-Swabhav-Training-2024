package com.techlabs.model;

public class BankAccount {
	private long accountNumber;
	private String name;
	private double balance;
	
	public void setaccountNumber(long accountNumber,String name,double balance) {
		this.accountNumber =accountNumber;
		this.name = name;
		this.balance =balance;
	}
	public long getaccountNumber() {
		return this.accountNumber;
	}
	public void setname(String name) {
		name = this.name;
	}
	public String getname() {
		return this.name;
	}
   public void setbalance(double balance) {
	   balance =this.balance;
   }
   public double getbalance() {
	   return balance;
   }
	       
}
