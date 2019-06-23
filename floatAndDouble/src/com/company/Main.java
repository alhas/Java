package com.company;

public class Main {

    public static void main(String[] args) {

        int myIntValue =  5 / 2;
        // width of int = 32 (4 bytes)
        float myFloatValue = 5 / 2f;
        // width of float = 32 (4 bytes)
        double myDoubleValue = 5.23d;
        // width of dobule = 64 (8 bytes)
        System.out.println("myintvalue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        double onePound = 0.45359237d;
        double Kilo = 200d;
        System.out.println(onePound * Kilo);

        double oneKilo = (onePound * Kilo) / (onePound);
        System.out.printf("Kilo = " + oneKilo);

    }
}
