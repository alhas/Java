package com.alhas;

public class Furniture  {

    private String manufacturer;
    private int height;
    private int width;

    public Furniture(String manufacturer, int height, int width) {
        this.manufacturer = manufacturer;
        this.height = height;
        this.width = width;
    }


    public void furnitureIsOpen(){
        System.out.println("Furniture is open.");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
