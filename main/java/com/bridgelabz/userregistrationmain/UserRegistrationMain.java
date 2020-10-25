package com.bridgelabz.userregistrationmain;

import java.util.Scanner;

public class UserRegistrationMain {

    public static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        userRegistrationMain.validateFirstName();
    }

    public void validateFirstName() {
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        if(firstName.matches(FIRST_NAME_REGEX))
            System.out.println("First name is valid");
        else
            System.out.println("First name is invalid");
    }

}

