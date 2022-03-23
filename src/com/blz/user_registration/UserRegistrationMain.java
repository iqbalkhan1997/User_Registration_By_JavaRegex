package com.blz.user_registration;
    import java.util.*;
public class UserRegistrationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration using regex program");
        UserRegistration validate= new UserRegistration();
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        validate.checkFirstName(firstName);
    }
}
