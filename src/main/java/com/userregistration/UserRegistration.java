package com.userregistration;
public class UserRegistration {
    static final String VALID_NAME="^[A-Z][a-z]{2,}$";
    static final String VALID_EMAIL="^[a-zA-Z]{3,}([._+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?$";
    static final String VALID_MOBILE_NUMBER="^[1-9]{2,3}[ ][1-9][0-9]{9}$";
    static final String VALID_PASSWORD_WITH_MINIMUM_EIGHT_CHARACTER="^[a-zA-Z0-9]{8,}$";
    static final String VALID_PASSWORD_WITH_ATLEAST_ONE_UPPER_CASE="^(?=.*[A-Z])[a-zA-Z0-9]{8,}$";

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
    }

    public boolean validateName(String name) {
        return name.matches(VALID_NAME);
    }

    public boolean validateEmail(String email) {
        return email.matches(VALID_EMAIL);
    }

    public boolean validateMobile(String mobile) {
        return mobile.matches(VALID_MOBILE_NUMBER);
    }

    public boolean validatePassword(String password,String validatePassword) {
        return password.matches(validatePassword);
    }
}
