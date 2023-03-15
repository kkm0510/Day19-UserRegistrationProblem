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

}