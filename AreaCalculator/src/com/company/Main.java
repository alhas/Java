package com.company;

public class Main {

    public static void main(String[] args) {

        area(12, 10);
        area(5);

    }

    private static double area(double radius) {

        double circle = radius * radius * Math.PI;

        if (radius > 0) {

            System.out.println("Vale is = " + circle);

        } else System.out.println("Invalid Value");
        return -1;

    }

    private static double area(double x, double y) {


        if ((x > 0) && y > 0) {

            System.out.println("Value is = " + x * y);

        } else System.out.println("invalid Value");
        return -1;

    }
}
