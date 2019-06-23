package com.alhas;

public class Main {

    public static void main(String[] args) {

        mercedes cla250 = new mercedes("HB", 18, 12, "Silver",
                1500, 300, 5000, 4, "Big");

        Car bmw = new Car("middle", 4, 4, "Silver", 1500, 250, 500, 4);
/*
        bmw.gear(2);
        bmw.move(1);
        */

        cla250.gear(3);
        cla250.move(100);
        System.out.println(" ");
        cla250.gear(5);
        cla250.move(250);


        System.out.println(cla250.getBody());


    }
}
