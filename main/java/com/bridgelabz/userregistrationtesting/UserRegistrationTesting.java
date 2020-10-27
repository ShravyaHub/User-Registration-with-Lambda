package com.bridgelabz.userregistrationtesting;

import java.util.function.Predicate;
import java.util.regex.Pattern;

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
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Predicate<String> predicate = pattern.asPredicate();
        boolean result = predicate.test(firstName);
        if(result) {
            System.out.println("First name is valid");
        } else {
            System.out.print("First name is invalid");
        }
        return iValidateFunction.validate(firstName, NAME_REGEX);
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Predicate<String> predicate = pattern.asPredicate();
        boolean result = predicate.test(lastName);
        if(result) {
            System.out.println("Last name is valid");
        } else {
            System.out.print("Last name is invalid");
        }
        return iValidateFunction.validate(lastName, NAME_REGEX);
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Predicate<String> predicate = pattern.asPredicate();
        boolean result = predicate.test(phoneNumber);
        if(result) {
            System.out.println("Phone number is valid");
        } else {
            System.out.print("Phone number is invalid");
        }
        return iValidateFunction.validate(phoneNumber, PHONE_NUMBER_REGEX);
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Predicate<String> predicate = pattern.asPredicate();
        boolean result = predicate.test(password);
        if(result) {
            System.out.println("Password is valid");
        } else {
            System.out.print("Password is invalid");
        }
        return iValidateFunction.validate(password, PASSWORD_REGEX);
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Predicate<String> predicate = pattern.asPredicate();
        boolean result = predicate.test(email);
        if(result) {
            System.out.println("Email is valid");
        } else {
            System.out.print("Email is invalid");
        }
        return iValidateFunction.validate(email, EMAIL_REGEX);
    }

}