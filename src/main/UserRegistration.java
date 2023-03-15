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

}