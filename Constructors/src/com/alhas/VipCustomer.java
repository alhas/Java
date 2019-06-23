package com.alhas;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAdress;


    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public VipCustomer() {
        this("Default Name", 5000, "default Address");

    }

    public VipCustomer(String name, int creditLimit, String emailAdress) {

        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
        this.name = name;

    }

    public VipCustomer(String name,int creditLimit){
        this.name = name;
        this.creditLimit = creditLimit;
    }








}
