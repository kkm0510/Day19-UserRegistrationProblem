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

}