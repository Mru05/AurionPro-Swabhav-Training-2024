package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.model.User;
import com.techlabs.model.EmailValidator;
import com.techlabs.model.PasswordValidator;
import com.techlabs.exceptions.EmailNotValidException;
import com.techlabs.exceptions.PasswordNotValidException;

public class UserTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter email:");
        String email = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        
        User user = new User(email, password);

        
        boolean hasEmailError = false;
        boolean hasPasswordError = false;

        
        try {
            EmailValidator emailValidator = new EmailValidator(email, password);
            emailValidator.validateEmail();
        } catch (EmailNotValidException e) {
            System.out.println("Error: " + e.getMessage());
            hasEmailError = true;
        }

       
        try {
            PasswordValidator passwordValidator = new PasswordValidator(email, password);
            passwordValidator.validatePassword();
        } catch (PasswordNotValidException e) {
            System.out.println("Error: " + e.getMessage());
            hasPasswordError = true;
        }

        
        if (!hasEmailError && !hasPasswordError) {
            user.display();
        }

        scanner.close();
    }
}