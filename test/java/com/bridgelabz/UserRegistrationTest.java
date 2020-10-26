package com.bridgelabz;

import com.bridgelabz.userregistrationtesting.InvalidCredentialsException;
import com.bridgelabz.userregistrationtesting.UserRegistrationTesting;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validateFirstName("Shravya");
        Assert.assertTrue(validation);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeLetters_ShouldThrowException() {
        try {
            UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
            boolean validation = userRegistrationTesting.validateFirstName("Sh");
            if(!validation) {
                throw new InvalidCredentialsException("First letter should be uppercase");
            }
        } catch(InvalidCredentialsException invalidCredentialsException) {
            System.out.println(invalidCredentialsException.getMessage());
        }
    }

    @Test
    public void givenFirstName_WhenFirstLetterNotUppercase_ShouldThrowException() {
        try {
            UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
            boolean validation = userRegistrationTesting.validateFirstName("shravya");
            if (!validation) {
                throw new InvalidCredentialsException("First letter should be uppercase");
            }
        } catch(InvalidCredentialsException invalidCredentialsException) {
            System.out.println(invalidCredentialsException.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validateLastName("Kotha");
        Assert.assertTrue(validation);
    }

    @Test
    public void givenLastName_WhenLessThanThreeLetters_ShouldThrowException() {
        try {
            UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
            boolean validation = userRegistrationTesting.validateLastName("Ko");
            if (!validation) {
                throw new InvalidCredentialsException("Last name should have at least three letters");
            }
        } catch(InvalidCredentialsException invalidCredentialsException) {
            System.out.println(invalidCredentialsException.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenFirstLetterNotUppercase_ShouldThrowException() {
        try {
            UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
            boolean validation = userRegistrationTesting.validateLastName("kotha");
            if (!validation) {
                throw new InvalidCredentialsException("First letter should be uppercase");
            }
        } catch(InvalidCredentialsException invalidCredentialsException) {
            System.out.println(invalidCredentialsException.getMessage());
        }
    }

    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validatePhoneNumber("91 9591266655");
        Assert.assertTrue(validation);
    }

    @Test
    public void givenPhoneNumber_WhenNoCountryCode_ShouldThrowException() {
        try {
            UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
            boolean validation = userRegistrationTesting.validatePhoneNumber(" 9591266655");
            if (!validation) {
                throw new InvalidCredentialsException("Phone number should have country code");
            }
        } catch(InvalidCredentialsException invalidCredentialsException) {
            System.out.println(invalidCredentialsException.getMessage());
        }
    }

    @Test
    public void givenPhoneNumber_WhenNoSpace_ShouldThrowException() {
        try {
            UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
            boolean validation = userRegistrationTesting.validatePhoneNumber("919591266655");
            if (!validation) {
                throw new InvalidCredentialsException("There should be a space between country code and phone number");
            }
        } catch(InvalidCredentialsException invalidCredentialsException) {
            System.out.println(invalidCredentialsException.getMessage());
        }
    }

    @Test
    public void givenPhoneNumber_WhenLessThanTenDigits_ShouldThrowException() {
        try {
            UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
            boolean validation = userRegistrationTesting.validatePhoneNumber("91 959126665");
            if (!validation) {
                throw new InvalidCredentialsException("Phone number should have at least ten digits");
            }
        } catch(InvalidCredentialsException invalidCredentialsException) {
            System.out.println(invalidCredentialsException.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validatePassword("Shravyak1!");
        Assert.assertTrue(validation);
    }

    @Test
    public void givenPassword_WhenLessThanEightCharacters_ShouldThrowException() {
        try {
            UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
            boolean validation = userRegistrationTesting.validatePassword("shravya");
            if (!validation) {
                throw new InvalidCredentialsException("Password should have at least eight characters");
            }
        } catch(InvalidCredentialsException invalidCredentialsException) {
            System.out.println(invalidCredentialsException.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNoUppercaseLetters_ShouldThrowException() {
        try {
            UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
            boolean validation = userRegistrationTesting.validatePassword("shravyak");
            if (!validation) {
                throw new InvalidCredentialsException("Password should have at least one uppercase letter");
            }
        } catch(InvalidCredentialsException invalidCredentialsException) {
            System.out.println(invalidCredentialsException.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNoNumbers_ShouldThrowException() {
        try {
            UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
            boolean validation = userRegistrationTesting.validatePassword("Shravyak");
            if (!validation) {
                throw new InvalidCredentialsException("Password should have at least one number");
            }
        } catch(InvalidCredentialsException invalidCredentialsException) {
            System.out.println(invalidCredentialsException.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNoSpecialCharacters_ShouldThrowException() {
        try {
            UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
            boolean validation = userRegistrationTesting.validatePassword("Shravyak1");
            if (!validation) {
                throw new InvalidCredentialsException("Password should have at least one special character");
            }
        } catch(InvalidCredentialsException invalidCredentialsException) {
            System.out.println(invalidCredentialsException.getMessage());
        }
    }

}
