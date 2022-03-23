package com.blz.user_registration;

public class UserRegistration {

    UserInformation storePattern =new UserInformation();
    public void validateFirstName(String firstName){
        storePattern.setFirstNamePattern("^[A-Z]{1}[a-z]{3,}$");
        String first= storePattern.getFirstNamePattern();
        storePattern.validatingInput(firstName,first,"FirstName");
    }
    public void validateLastName(String lastName){
        storePattern.setLastNamePattern("^[A-Z]{1}[a-z]{3,}$");
        String last= storePattern.getLastNamePattern();
        storePattern.validatingInput(lastName,last,"LastName");
    }

    public void validateEmail(String email){
        storePattern.setEmail("^[a-z]{3,}(.[a-z]{3,})*@[a-z]{2,}.[a-z]{2,3}([.+_-][a-z]{2})*$");
        String mail= storePattern.getEmailPattern();
        storePattern.validatingInput(email,mail,"Email");
    }

}

