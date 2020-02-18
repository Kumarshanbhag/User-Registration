package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userValidate = new UserRegistration();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean firstName = userValidate.validateName("Kumar");
        Assert.assertTrue("true", firstName);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean firstName = userValidate.validateName("kumar");
        Assert.assertFalse("true", firstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean lastName = userValidate.validateName("Shanbhag");
        Assert.assertTrue("true", lastName);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean lastName = userValidate.validateName("shanbhag");
        Assert.assertFalse("true", lastName);
    }

    @Test
    public void givenEmail_WhenProperShould_ReturnTrue() {
        boolean email = userValidate.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue("true", email);
    }

    @Test
    public void givenEmail_WhenNotProperShould_ReturnTrue() {
        boolean email = userValidate.validateEmail("abc..2002@gmail.com");
        Assert.assertFalse("true", email);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean mobile = userValidate.validateMobile("91 9745632145");
        Assert.assertTrue("true",mobile);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnTrue() {
        boolean mobile = userValidate.validateMobile("919745632145");
        Assert.assertFalse("true",mobile);
    }

    @Test
    public void givenPasswordMinimumEightCharacters_WhenProper_ShouldReturnTrue() {
        boolean password=userValidate.validatePassword("kumarshanbhag",UserRegistration.VALID_PASSWORD_WITH_MINIMUM_EIGHT_CHARACTER);
        Assert.assertTrue("true",password);
    }

    @Test
    public void givenPasswordMinimumEightCharacters_WhenNotProper_ShouldReturnTrue() {
        boolean password=userValidate.validatePassword("kumar",UserRegistration.VALID_PASSWORD_WITH_MINIMUM_EIGHT_CHARACTER);
        Assert.assertFalse("true",password);
    }

    @Test
    public void givenPasswordAtleast1UpperCase_WhenProper_ShouldReturnTrue() {
        boolean password=userValidate.validatePassword("Kumarshanbhag",UserRegistration.VALID_PASSWORD_WITH_ATLEAST_ONE_UPPER_CASE);
        Assert.assertTrue("true",password);
    }

    @Test
    public void givenPasswordAtleast1UpperCase_WhenNotProper_ShouldReturnTrue() {
        boolean password=userValidate.validatePassword("kumarshanbhag",UserRegistration.VALID_PASSWORD_WITH_ATLEAST_ONE_UPPER_CASE);
        Assert.assertFalse("true",password);
    }

    @Test
    public void givenPasswordAtleast1Number_WhenProper_ShouldReturnTrue() {
        boolean password=userValidate.validatePassword("Kumarshanbhag302",UserRegistration.VALID_PASSWORD_WITH_ATLEAST_ONE_NUMBER);
        Assert.assertTrue("true",password);
    }

    @Test
    public void givenPasswordAtleast1Number_WhenNotProper_ShouldReturnTrue() {
        boolean password=userValidate.validatePassword("Kumarshanbhag",UserRegistration.VALID_PASSWORD_WITH_ATLEAST_ONE_NUMBER);
        Assert.assertFalse("true",password);
    }
}
