package test;

import org.junit.Assert;
import org.junit.Test;
import static main.UserRegistration.*;

public class UserRegistrationTest {

    @Test
    public void givenAFirstNameCheckIfItIsValid() {
        Assert.assertTrue(checkValidName("Kartikeya"));
    }
}