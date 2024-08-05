package com.techlabs.behvioural.observer.test;

import java.util.Scanner;

import com.techlabs.behvioural.observer.model.Account;
import com.techlabs.behvioural.observer.model.EmailNotifier;
import com.techlabs.behvioural.observer.model.InsufficientFundSException;
import com.techlabs.behvioural.observer.model.SMSNotifier;
import com.techlabs.behvioural.observer.model.WhatsappNotifier;

public class AccountNotifierTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Account object
        System.out.println("Enter account number:");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter account holder name:");
        String name = scanner.nextLine();
        System.out.println("Enter initial balance:");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Account account = new Account(accountNumber, name, balance);

        // Ask user which notifications they want
        System.out.println("Select notification methods (comma-separated):");
        System.out.println("1. SMS");
        System.out.println("2. Email");
        System.out.println("3. WhatsApp");

        String[] choices = scanner.nextLine().split(",");

        for (String choice : choices) {
            switch (choice.trim()) {
                case "1":
                    account.registerNotifier(new SMSNotifier());
                    break;
                case "2":
                    account.registerNotifier(new EmailNotifier());
                    break;
                case "3":
                    account.registerNotifier(new WhatsappNotifier());
                    break;
                default:
                    System.out.println("Invalid choice: " + choice);
            }
        }

        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    // Deposit
                    System.out.println("Enter deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    // Withdraw
                    System.out.println("Enter withdrawal amount:");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (InsufficientFundSException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    // Exit
                    keepRunning = false;
                    System.out.println("Thankyou For using our bank Account \nExiting...");
                    break;
                default:
                    System.out.println("Invalid action. Please select 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
