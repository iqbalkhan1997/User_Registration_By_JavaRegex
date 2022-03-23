package com.blz.user_registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public final String firstName = "^[A-Z]{1}[a-z]{2,}$";


    public void checkFirstName(String enteredFirstName) {
        Pattern pattern = Pattern.compile(firstName);
        Matcher matcher = pattern.matcher(enteredFirstName);
        if (matcher.matches())
            System.out.println("Entered firstName " +enteredFirstName+" is valid");
        else
            System.out.println("firstName " +enteredFirstName+" is invalid");
    }
}

