package com.techlabs.run;
import com.techlabs.run.SavingAccount;
import com.techlabs.test.CurrentAccount;

import java.util.Scanner;

public class BankingSystem {
    SavingAccount savingsAccount = new SavingAccount(123456, "Mrunalini", 3000);
    CurrentAccount currentAccount = new CurrentAccount(999999, "Sanjay", 2000);

    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();
        system.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to RBI Online Banking");
            System.out.println("1. Create a new account");
            System.out.println("2. Credit amount");
            System.out.println("3. Debit amount");
            System.out.println("4. Display account details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    createNewAccount(scanner);
                    break;
                case 2:
                	System.out.println("Enter amount to credit");
                	double amount = scanner.nextInt();
                    savingsAccount.credit(amount);
                    break;
                case 3:
                	System.out.println("Enter amount to credit");
                	double amount2 = scanner.nextInt();
                    savingsAccount.debit(amount2);
                    break;
                case 4:
                    savingsAccount.display();
                case 5:
                    System.out.println("Thank you for using our banking system!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private void createNewAccount(Scanner scanner) {
        System.out.println("\nChoose account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
       System.out.println("Please press enter to get your account number");
        
        savingsAccount.random();
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        if (choice == 1) {
            System.out.print("Enter minimum balance: ");
            double minBalance = scanner.nextDouble();
            savingsAccount = new SavingAccount(accountNumber, name, balance, minBalance);
            System.out.println("Savings Account created successfully.");
        } else if (choice == 2) {
            System.out.print("Enter overdraft limit: ");
            int overdraftLimit = scanner.nextInt();
            currentAccount = new CurrentAccount(accountNumber, name, balance, overdraftLimit);
            System.out.println("Current Account created successfully.");
        } else {
            System.out.println("Invalid account type.");
        }
    }

    private void creditAmount(Scanner scanner) {
        System.out.println("\nChoose account type to credit:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter amount to credit: ");
        double amount = scanner.nextDouble();

        if (choice == 1 && savingsAccount != null) {
            savingsAccount.credit(amount);
        } else if (choice == 2 && currentAccount != null) {
            currentAccount.credit(amount);
        } else {
            System.out.println("Invalid account type or account not created yet.");
        }
    }

    private void debitAmount(Scanner scanner) {
        System.out.println("\nChoose account type to debit:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter amount to debit: ");
        double amount = scanner.nextDouble();

        if (choice == 1 && savingsAccount != null) {
            savingsAccount.debit(amount);
        } else if (choice == 2 && currentAccount != null) {
            currentAccount.debit(amount);
        } else {
            System.out.println("Invalid account type or account not created yet.");
        }
    }

    private void displayAccountDetails(Scanner scanner) {
        System.out.println("\nChoose account type to display:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        if (choice == 1 && savingsAccount != null) {
            savingsAccount.display();
        } else if (choice == 2 && currentAccount != null) {
            currentAccount.display();
        } else {
            System.out.println("Invalid account type or account not created yet.");
        }
    }
}
