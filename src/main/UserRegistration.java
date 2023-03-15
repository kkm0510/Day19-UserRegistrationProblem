package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean checkValidName(String name){
        Pattern pattern=Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher=pattern.matcher(name);
        boolean ans=matcher.matches();
        return ans;
    }

    public static boolean checkValidEmail(String email){
        Pattern pattern=Pattern.compile("^[a-zA-Z0-9]+[._+-]?[a-zA-Z0-9]+@[a-zA-Z0-9]+[.]+[a-z]{2,4}[.]?[a-z]{0,3}");
        Matcher matcher=pattern.matcher(email);
        boolean ans=matcher.matches();
        return ans;
    }

    public static boolean checkValidMobileNumber(String number){
        Pattern pattern=Pattern.compile("[0-9]{2}[ ][0-9]{10}");
        Matcher matcher=pattern.matcher(number);
        boolean ans=matcher.matches();
        return ans;
    }

    public static boolean checkValidPassword(String password){
        Pattern pattern=Pattern.compile("[a-zA-Z0-9]{8,}");
        Matcher matcher=pattern.matcher(password);
        boolean ans=matcher.matches();
        return ans;
    }

}