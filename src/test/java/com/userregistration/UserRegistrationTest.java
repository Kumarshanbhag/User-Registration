package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userValidate=new UserRegistration();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean firstName=userValidate.validateFirstName("Kumar");
        Assert.assertTrue("true",firstName);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean firstName=userValidate.validateFirstName("kumar");
        Assert.assertFalse("true",firstName);
    }
}
