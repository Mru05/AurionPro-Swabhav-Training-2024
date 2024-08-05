package comp.techlabs.list.test;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import comp.techlabs.list.Account;

public class AccountTest {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Account> accounts = new ArrayList<>();

	        System.out.print("Enter the number of accounts to create: ");
	        int numberOfAccounts = scanner.nextInt();
	     

	        for (int i = 0; i < numberOfAccounts; i++) {
	            System.out.print("Enter account holder's name: ");
	            String name = scanner.nextLine();

	            System.out.print("Enter initial balance: ");
	            double balance = scanner.nextDouble();
	         

	           Account account = new Account(name, balance);
	            accounts.add(account);
	        }

	       
	        System.out.println("\nAll Accounts:");
	        for (Account account : accounts) {
	            System.out.println(account);
	        }

	       //Generating account number with max balance 
	        Account maxBalanceAccount = Collections.max(accounts, Comparator.comparingDouble(Account::getBalance));
	        System.out.println("\nAccount with the maximum balance:");
	        System.out.println(maxBalanceAccount);

	       //used this to print in ascending order
	        accounts.sort((a, b) -> Double.compare(b.getBalance(), a.getBalance()));
	        System.out.println("\nAccounts in descending order by balance:");
	        for (Account account : accounts) {
	            System.out.println(account);
	        }

	        scanner.close();
	    }
	}

