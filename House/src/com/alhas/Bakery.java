package com.alhas;

public class Bakery {

    private String manufacturer;

    public Bakery(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void bakeryWorking(String cooking){
        System.out.println("Bakery Cooking " + cooking);
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
