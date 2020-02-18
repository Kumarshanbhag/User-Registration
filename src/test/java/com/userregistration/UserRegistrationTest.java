package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userValidate=new UserRegistration();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean firstName=userValidate.validateName("Kumar");
        Assert.assertTrue("true",firstName);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean firstName=userValidate.validateName("kumar");
        Assert.assertFalse("true",firstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean lastName=userValidate.validateName("Shanbhag");
        Assert.assertTrue("true",lastName);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean lastName=userValidate.validateName("shanbhag");
        Assert.assertFalse("true",lastName);
    }

    @Test
    public void givenEmail_WhenProperShould_ReturnTrue() {
        boolean email=userValidate.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue("true",email);
    }

    @Test
    public void givenEmail_WhenNotProperShould_ReturnTrue() {
        boolean email=userValidate.validateEmail("abc..2002@gmail.com");
        Assert.assertFalse("true",email);
    }
}
