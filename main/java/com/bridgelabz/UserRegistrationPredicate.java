package com.bridgelabz;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistrationPredicate {

    public static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    public static final String PHONE_NUMBER_REGEX = "^[9][1][ ][6-9][0-9]{9}$";
    public static final String PASSWORD_REGEX = "^(?=.*[!@#$%^&+=])(?=.*[0-9])(?=.*[A-Z]).{8,}$";
    public static final String EMAIL_REGEX = "^([a-z0-9]+[-._+]?[a-z0-9]+)+@[a-z0-9-]+.[a-z]{2,3}.[a-z]{2,3}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistrationPredicate userRegistrationPredicate = new UserRegistrationPredicate();
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        userRegistrationPredicate.validate(firstName, NAME_REGEX);
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        userRegistrationPredicate.validate(lastName, NAME_REGEX);
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        userRegistrationPredicate.validate(email, EMAIL_REGEX);
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        userRegistrationPredicate.validate(phoneNumber, PHONE_NUMBER_REGEX);
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        userRegistrationPredicate.validate(password, PASSWORD_REGEX);
    }

    public void validate(String credential, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Predicate<String> predicate = pattern.asPredicate();
        boolean result = predicate.test(credential);
        if(result) {
            System.out.println("Valid");
        } else {
            System.out.print("Invalid\n");
        }
    }
}
