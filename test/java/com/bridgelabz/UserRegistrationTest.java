package com.bridgelabz;

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
    public void givenFirstName_WhenLessThanThreeLetters_ShouldReturnFalse() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validateFirstName("Sh");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenFirstName_WhenFirstLetterNotUppercase_ShouldReturnFalse() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validateFirstName("shravya");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validateLastName("Kotha");
        Assert.assertTrue(validation);
    }

    @Test
    public void givenLastName_WhenLessThanThreeLetters_ShouldReturnFalse() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validateLastName("Ko");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenLastName_WhenFirstLetterNotUppercase_ShouldReturnFalse() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validateLastName("kotha");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validatePhoneNumber("91 9591266655");
        Assert.assertTrue(validation);
    }

    @Test
    public void givenPhoneNumber_WhenNoCountryCode_ShouldReturnFalse() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validatePhoneNumber(" 9591266655");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenPhoneNumber_WhenNoSpace_ShouldReturnFalse() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validatePhoneNumber("919591266655");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenPhoneNumber_WhenLessThanTenDigits_ShouldReturnFalse() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validatePhoneNumber("91 959126665");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validatePassword("Shravyak1!");
        Assert.assertTrue(validation);
    }

    @Test
    public void givenPassword_WhenLessThanEightCharacters_ShouldReturnFalse() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validatePassword("shravya");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenPassword_WhenNoUppercaseLetters_ShouldReturnFalse() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validatePassword("shravyak");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenPassword_WhenNoNumbers_ShouldReturnFalse() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validatePassword("Shravyak");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenPassword_WhenNoSpecialCharacters_ShouldReturnFalse() {
        UserRegistrationTesting userRegistrationTesting = new UserRegistrationTesting();
        boolean validation = userRegistrationTesting.validatePassword("Shravyak1");
        Assert.assertFalse(validation);
    }

}
