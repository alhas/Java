package com.alhas;

public class ExtentdedPassword extends Password {

    private int decryptedPassword;

    public ExtentdedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storepassWord() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
