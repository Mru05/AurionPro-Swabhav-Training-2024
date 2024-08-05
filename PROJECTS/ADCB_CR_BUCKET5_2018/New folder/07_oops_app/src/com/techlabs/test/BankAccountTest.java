package com.techlabs.test;

import com.techlabs.model.BankAccount;
import java.util.Scanner;
import java.util.Random;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        long a = 1000000000L + random.nextInt(900000000); //generate a random number

      
        System.out.print("Enter Account Holder Name: ");
        String n = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double b = scanner.nextDouble();

        
        BankAccount account = new BankAccount();
//        account.setaccountNumber(a);
        account.setname(n);
        account.setbalance(b);

    
        System.out.println("Account Number: " + account.getaccountNumber());
        System.out.println("Account Holder Name: " + account.getname());
        System.out.println("Balance: " + account.getbalance());

        
        System.out.print("Enter amount to credit: ");
        double creditAmount = scanner.nextDouble();
        if (creditAmount > 0) {
            account.setbalance(account.getbalance() + creditAmount);
            System.out.println("Amount " + creditAmount + " credited. New balance: " + account.getbalance());
        } else {
            System.out.println("Invalid amount, Credit amount must be positive.");
        }

        System.out.print("Enter amount to debit: ");
        double debitAmount = scanner.nextDouble();
        if (debitAmount > 0) {
            if (account.getbalance() >= debitAmount) {
                account.setbalance(account.getbalance() - debitAmount);
                System.out.println("Amount " + debitAmount + " debited. New balance: " + account.getbalance());
            } else {
                System.out.println("Insufficient funds. Debit amount exceeds balance.");
            }
        } else {
            System.out.println("Invalid amount, Debit amount must be positive.");
        }

        scanner.close();
    }
}
