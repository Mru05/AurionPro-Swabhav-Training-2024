package cmp.techlabs.test;
import java.util.Scanner;

import com.techlabs.model.InputValidator;


public class InputValidatorsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputValidator validator = new InputValidator();

        String username = promptForValidUsername(scanner, validator);
        String password = promptForValidPassword(scanner, validator);
        String email = promptForValidEmail(scanner, validator);

        System.out.println("All inputs are valid!");
        scanner.close();
    }

    private static String promptForValidUsername(Scanner scanner, InputValidator validator) {
        String username;
        do {
            System.out.println("Enter username: ");
            username = scanner.next();
            if (!validator.validateUsername(username)) {
                System.out.println("Username is invalid. Please try again.");
            }
        } while (!validator.validateUsername(username));
        System.out.println("Username is valid");
        return username;
    }

    private static String promptForValidPassword(Scanner scanner, InputValidator validator) {
        String password;
        do {
            System.out.println("Enter password: ");
            password = scanner.next();
            if (!validator.validatePassword(password)) {
                System.out.println("Password is invalid. Please try again.");
            }
        } while (!validator.validatePassword(password));
        System.out.println("Password is valid");
        return password;
    }

    private static String promptForValidEmail(Scanner scanner, InputValidator validator) {
        String email;
        do {
            System.out.println("Enter Email: ");
            email = scanner.next();
            if (!validator.validateEmail(email)) {
                System.out.println("Email is invalid. Please try again.");
            }
        } while (!validator.validateEmail(email));
        System.out.println("Email is valid");
        return email;
    }
}