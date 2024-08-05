package com.techlabs.model;

import com.techlabs.exceptions.EmailNotValidException;
import com.techlabs.model.User;

public class EmailValidator extends User {

    public EmailValidator(String email, String password) {
        super(email, password);
    }

    public void validateEmail() {
        String email = getEmail();
        String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!email.matches(pattern)) {
            throw new EmailNotValidException(email);
        }
    }

    }
