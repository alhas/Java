package com.alhas;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase = new Case("222B", "Dell", "240", dimensions);


        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard themodherboard = new Motherboard("Bj-200", "Asus", 4, 6, "v2.44");


        PC thePC = new PC(theCase, theMonitor, themodherboard);

       thePC.powerUp();
    }
}
