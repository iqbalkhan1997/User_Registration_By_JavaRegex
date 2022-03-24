package com.blz.user_registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInformation {
    private String firstNamePattern;
    private String lastNamePattern;
    private String emailPattern;
    private String mobNumPattern;
    private String passwordPattern;

    public void setFirstNamePattern(String firstNamePattern) {
        this.firstNamePattern = firstNamePattern;
    }

    public String getFirstNamePattern() {   return firstNamePattern;    }

    public String getLastNamePattern() {    return lastNamePattern;    }

    public void setLastNamePattern(String lastNamePattern) {
        this.lastNamePattern = lastNamePattern;
    }

    public String getEmailPattern() {
        return emailPattern;
    }

    public void setEmailPattern(String emailPattern) {  this.emailPattern = emailPattern;   }

    public String getMobNumPattern() {
        return mobNumPattern;
    }

    public void setMobNumPattern(String mobNumPattern) {
        this.mobNumPattern = mobNumPattern;
    }

    public String getPasswordPattern() {    return passwordPattern; }

    public void setPasswordPattern(String passwordPattern) {    this.passwordPattern = passwordPattern; }

    public void validatingInput(String input, String checkPattern, String option){
        Pattern pattern = Pattern.compile(checkPattern);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches())
            System.out.println("Entered "+option+ " : " +input+" is valid");
        else
            System.out.println("Entered "+option+ " : " +input+" is invalid");
    }

}
