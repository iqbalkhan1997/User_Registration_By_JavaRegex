package com.blz.user_registration;
    import java.util.*;
public class UserRegistrationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration using regex program");
        UserRegistration validate= new UserRegistration();
        Scanner scan = new Scanner(System.in);
        System.out.println("1.To Validate the First name.");
        System.out.println("2.To Validate the Second Name.");
        System.out.println("3.To Validate Email id");
        System.out.println("4.To Validate Mobile Number");
        System.out.println("5.To Validate Password");
        System.out.println("Enter the option number to perform the operation");
        int option = scan.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter the First Name. Note: first letter should be capital");
                String firstName = scan.next();
                validate.validateFirstName(firstName);
                break;
            case 2:
                System.out.println("Enter the Last name. Note: first letter should be capital");
                String lastName = scan.next();
                validate.validateLastName(lastName);
                break;
            case 3:
                System.out.println("Enter the email id.E.g:- abc.xyz@bl.co.in");
                String email = scan.next();
                validate.validateEmail(email);
                break;
            case 4:
                System.out.println("Enter the Mob no:. Eg:-91 9919819801");
                scan.nextLine();
                String input = scan.nextLine();
                validate.validateMobNumber(input);
                break;
            case 5:
                System.out.println("Enter the Password. Note: minimum 1 UpperCase & minimum 8 characters should be given");
                String password= scan.next();
                validate.validatePassword(password);
                break;
            default:
                System.out.println("Please Enter valid option to validate the patter");
                break;
        }
    }
}
