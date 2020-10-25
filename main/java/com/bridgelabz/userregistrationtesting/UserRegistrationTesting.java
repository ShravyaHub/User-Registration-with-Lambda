package com.bridgelabz.userregistrationtesting;

public class UserRegistrationTesting {

    public static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    public static final String EMAIL_REGEX = "^([a-z0-9]+[-._+]?[a-z0-9]+)+@[a-z0-9-]+.[a-z]{2,3}.[a-z]{2,3}$";
    public static final String PHONE_NUMBER_REGEX = "^[9][1][ ][6-9][0-9]{9}$";
    public static final String PASSWORD_REGEX = "^(?=.*[!@#$%^&+=])(?=.*[0-9])(?=.*[A-Z]).{8,}$";

    public boolean validateFirstName(String firstName) {
        return firstName.matches(NAME_REGEX);
    }

    public boolean validateLastName(String lastName) {
        return lastName.matches(NAME_REGEX);
    }
    
    public boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches(PHONE_NUMBER_REGEX);
    }

    public boolean validatePassword(String password) {
        return password.matches(PASSWORD_REGEX);
    }

}