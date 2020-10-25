package com.bridgelabz.userregistrationmain;

import java.util.Scanner;

public class UserRegistrationMain {

    public static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        userRegistrationMain.validateFirstName();
        userRegistrationMain.validateLastName();
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

}

