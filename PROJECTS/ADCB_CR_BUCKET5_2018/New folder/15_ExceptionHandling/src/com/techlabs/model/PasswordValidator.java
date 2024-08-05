package com.techlabs.model;
import com.techlabs.exceptions.PasswordNotValidException;
import com.techlabs.model.User;

public class PasswordValidator extends User {

    public PasswordValidator(String email, String password) {
        super(email, password);
    }

    public void validatePassword() {
        String password = getPassword();
        if (password == null || password.length() < 8) {
            throw new PasswordNotValidException(password);
        }
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        if (!(hasUpperCase && hasSpecialChar && hasDigit)) {
            throw new PasswordNotValidException(password);
        }
    }
}