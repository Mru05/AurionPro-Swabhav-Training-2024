package com.techlabs.test;

import com.techlabs.model.BankingApp;
//import com.techlabs.model.AccountType;
import java.util.Random;
import java.util.Scanner;

public class BankingApptest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hello!!! \nHope you are having a good day!! \nWelcome to SBI online banking service!!");

        System.out.println("Please enter the number of accounts you want to create: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        BankingApp[] bankingApps = new BankingApp[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter account details for account " + (i + 1) + ":");
            long accountNumber = generateAccountNumber(random);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.println("Account Type: ");
            System.out.println("1. Saving  \n2. Current ");
            int accountTypeChoice = scanner.nextInt();
            scanner.nextLine();
//            AccountType accountType = (accountTypeChoice == 1) ? AccountType.SAVING : AccountType.CURRENT;
         
//            bankingApps[i] = new BankingApp(accountNumber, name, balance, accountType);
        }

        System.out.println("Accounts created successfully!");

        // Display the number of accounts created and their account details
        System.out.println("\nNumber of accounts created: " + n);
        for (int i = 0; i < bankingApps.length; i++) {
            BankingApp account = bankingApps[i];
            System.out.println("Account " + (i + 1) + " Details:");
            System.out.println("  Number: " + account.getAccountNumber());
            System.out.println("  Name: " + account.getName());
            System.out.println("  Balance: " + account.getBalance());
            System.out.println("  Account Type: " + account.getAccountType());
        }

        boolean exit = false;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Credit an account");
            System.out.println("2. Debit an account");
            System.out.println("3. Find account with maximum balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    long creditAccountNumber = scanner.nextLong();
                    System.out.print("Enter amount to credit: ");
                    double creditAmount = scanner.nextDouble();
                    scanner.nextLine();
                    creditAccount(bankingApps, creditAccountNumber, creditAmount);
                    displayAccountBalance(bankingApps, creditAccountNumber);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    long debitAccountNumber = scanner.nextLong();
                    System.out.print("Enter amount to debit: ");
                    double debitAmount = scanner.nextDouble();
                    scanner.nextLine(); 
                    debitAccount(bankingApps, debitAccountNumber, debitAmount);
                    displayAccountBalance(bankingApps, debitAccountNumber);
                    break;
                case 3:
                    BankingApp maxBalanceAccount = getMaximumBalanceAccount(bankingApps);
                    System.out.println("Account with maximum balance:");
                    System.out.println("Account Number: " + maxBalanceAccount.getAccountNumber());
                    System.out.println("Name: " + maxBalanceAccount.getName());
                    System.out.println("Balance: " + maxBalanceAccount.getBalance());
                    System.out.println("Account Type: " + maxBalanceAccount.getAccountType());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.out.println("Thank you for banking with us! Hope we see you again.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!exit);

        scanner.close();
    }

    private static long generateAccountNumber(Random random) {
        long accountNumber = 0;
        for (int i = 0; i < 12; i++) {
            accountNumber = accountNumber * 10 + random.nextInt(10);
        }
        return accountNumber;
    }

    private static BankingApp getMaximumBalanceAccount(BankingApp[] accounts) {
        if (accounts == null || accounts.length == 0) {
            return null;
        }

        BankingApp maxBalanceAccount = accounts[0];
        for (int i = 1; i < accounts.length; i++) {
            if (accounts[i].getBalance() > maxBalanceAccount.getBalance()) {
                maxBalanceAccount = accounts[i];
            }
        }
        return maxBalanceAccount;
    }

    private static void creditAccount(BankingApp[] accounts, long accountNumber, double amount) {
        if (amount <= 0) {
            System.out.println("Amount to be credited should be positive and not zero.");
            return;
        }

        for (BankingApp account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.credit(amount);
                System.out.println("Amount credited successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    private static void debitAccount(BankingApp[] accounts, long accountNumber, double amount) {
        if (amount <= 0) {
            System.out.println("Amount to be debited should be positive.");
            return;
        }

        for (BankingApp account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                if (amount > account.getBalance()) {
                    System.out.println("Insufficient balance. Cannot debit amount greater than the current balance.");
                } else {
                    account.debit(amount);
                    System.out.println("Amount debited successfully.");
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }

    private static void displayAccountBalance(BankingApp[] accounts, long accountNumber) {
        for (BankingApp account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                System.out.println("Current balance: " + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }
}
