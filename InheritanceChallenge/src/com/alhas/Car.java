package com.alhas;

public class Car extends Vehichle {
    private int size;

    public Car(String body, int wheels, int engine, String color, int heavy, int speed, int tork, int size) {
        super(body, wheels, engine, color, heavy, speed, tork);
        this.size = size;
    }


    public void engineStart() {
        System.out.println("Engine Start");
    }

    public void gasPedal() {
        engineStart();
        System.out.println("Gas pedal called.");
    }

    public void move(int speed) {
        gasPedal();
        System.out.println("car moving");
        System.out.println("Your car movement is " + speed);

    }

    public void gear(int gear) {
        System.out.println("your gear " + gear);
    }

}
