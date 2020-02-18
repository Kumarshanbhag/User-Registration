package com.userregistration;
public class UserRegistration {
    private final String VALID_NAME="^[A-Z][a-z]{2,}$";
    private final String VALID_EMAIL="^[a-zA-Z]{3,}([._+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?$";
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
    }

    public boolean validateName(String name) {
        return name.matches(VALID_NAME);
    }

    public boolean validateEmail(String email) {
        return email.matches(VALID_EMAIL);
    }
}
