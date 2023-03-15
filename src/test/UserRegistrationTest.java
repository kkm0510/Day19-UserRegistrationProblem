package test;

import org.junit.Assert;
import org.junit.Test;

import static main.UserRegistration.*;

public class UserRegistrationTest {

    @Test
    public void givenFirstNameCheckIfItIsValid() {
        Assert.assertTrue(checkValidName("Kartikeya"));
    }

    @Test
    public void givenLastNameCheckIfItIsValid() {
        Assert.assertTrue(checkValidName("Maan"));
    }

    @Test
    public void givenEmailAddressCheckIfItIsValid() {
        Assert.assertTrue(checkValidEmail("Kartikeya.maan1997@gmail.com"));
    }

    @Test
    public void givenMultipleEmailAddressesCheckCorrectAreValidAndInCorrectAreInvalid() {
        String[] validEmails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com",
        };
        String[] invalidEmails = {
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au",
        };
        for (String email : validEmails) {
            Assert.assertTrue(checkValidEmail(email));
        }
        for(String email : invalidEmails){
            Assert.assertFalse(checkValidEmail(email));
        }
    }
}