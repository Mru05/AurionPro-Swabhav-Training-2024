package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.exceptions.InsufficientBalanceException;
import com.techlabs.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Account account;
		
		try {
			System.out.println("Enter account number : ");
			int accountNumber = scanner.nextInt();
			System.out.println("Enter name : ");
			String name = scanner.next();
			System.out.println("Enter balance");
			double balance = scanner.nextDouble();
			account = new Account(accountNumber, name, balance);
			System.out.println("Account number "+accountNumber);
			System.out.println("Name "+name);
			System.out.println("Initial balance : "+balance);
			
			System.out.println("Choose an operation");
			System.out.println("1.Credit amount");
			 System.out.println("2. Debit amount");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the amount to credit : ");
	                    double creditAmount = scanner.nextDouble();
	                    account.credit(creditAmount);
	                    System.out.println("Balance after credit: " + account.getBalance());
	                    break;
	                case 2:
	                    System.out.print("Enter debit amount: ");
	                    double debitAmount = scanner.nextDouble();
	                    account.debit(debitAmount);
	                    System.out.println("Balance after debit: " + account.getBalance());
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please select 1 for credit or 2 for debit.");
	            }
	            System.out.print("Enter another debit amount: ");
	            double debitAmount = scanner.nextDouble();
	            account.debit(debitAmount); 
	        } catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
		}
		

	}

}
