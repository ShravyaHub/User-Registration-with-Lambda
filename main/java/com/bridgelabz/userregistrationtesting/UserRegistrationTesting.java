package com.bridgelabz.userregistrationtesting;

@FunctionalInterface
interface IValidateFunction {
    boolean validate(String credential, String pattern);
}

public class UserRegistrationTesting {

    public static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    public static final String PHONE_NUMBER_REGEX = "^[9][1][ ][6-9][0-9]{9}$";
    public static final String PASSWORD_REGEX = "^(?=.*[!@#$%^&+=])(?=.*[0-9])(?=.*[A-Z]).{8,}$";
    public static final String EMAIL_REGEX = "^([a-z0-9]+[-._+]?[a-z0-9]+)+@[a-z0-9-]+.[a-z]{2,3}.[a-z]{2,3}$";
    IValidateFunction iValidateFunction;

    public UserRegistrationTesting()
    {
        iValidateFunction = (credential , pattern) -> credential.matches(pattern);
    }

    public boolean validateFirstName(String firstName) {
        return iValidateFunction.validate(firstName, NAME_REGEX);
    }

    public boolean validateLastName(String lastName) {
        return iValidateFunction.validate(lastName, NAME_REGEX);
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        return iValidateFunction.validate(phoneNumber, PHONE_NUMBER_REGEX);
    }

    public boolean validatePassword(String password) {
        return iValidateFunction.validate(password, PASSWORD_REGEX);
    }

    public boolean validateEmail(String email) {
        return iValidateFunction.validate(email, EMAIL_REGEX);
    }

}