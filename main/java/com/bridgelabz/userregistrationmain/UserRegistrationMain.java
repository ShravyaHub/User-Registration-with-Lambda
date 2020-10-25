package com.bridgelabz.userregistrationmain;

import java.util.Scanner;

public class UserRegistrationMain {

    public static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    public static final String EMAIL_REGEX = "^([a-z0-9]+[-._+]?[a-z0-9]+)+@[a-z0-9-]+.[a-z]{2,3}.[a-z]{2,3}$";
    public static final String PHONE_NUMBER_REGEX = "^[9][1][ ][6-9][0-9]{9}$";
    public static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[A-Z]).{8,}$";

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        userRegistrationMain.validateFirstName();
        userRegistrationMain.validateLastName();
        userRegistrationMain.validateEmail();
        userRegistrationMain.validatePhoneNumber();
        userRegistrationMain.validatePassword();
    }

    public void validateFirstName() {
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        if(firstName.matches(NAME_REGEX))
            System.out.println("First name is valid");
        else
            System.out.println("First name is invalid");
    }

    public void validateLastName() {
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        if(lastName.matches(NAME_REGEX))
            System.out.println("Last name is valid");
        else
            System.out.println("Last name is invalid");
    }

    public void validateEmail() {
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        if(email.matches(EMAIL_REGEX))
            System.out.println("Email is valid");
        else
            System.out.println("Email is invalid");
    }

    public void validatePhoneNumber() {
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        if(phoneNumber.matches(PHONE_NUMBER_REGEX))
            System.out.println("Phone number is valid");
        else
            System.out.println("Phone number is invalid");
    }

    public void validatePassword() {
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        if(password.matches(PASSWORD_REGEX))
            System.out.println("Password is valid");
        else
            System.out.println("Password is invalid");
    }

}

