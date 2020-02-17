package com.userregistration;
public class UserRegistration {
    private final String VALID_NAME="^[A-Z][a-z]{2,}$";
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
    }

    public boolean validateFirstName(String firstName) {
        return firstName.matches(VALID_NAME);
    }
}
