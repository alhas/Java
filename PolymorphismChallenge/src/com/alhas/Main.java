package com.alhas;

import javax.naming.Name;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;


    public Car(String name, boolean engine, int cylinders, int wheels) {
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }


    public String startEngine() {
        return "Engine have starting.";
    }

    public String accelerate(int acclerate) {
        return "Your accelerate is " + acclerate;
    }


    public String theBreak() {

        return "Your car was stop";
    }

}

class BMW extends Car {
    public BMW() {
        super("BMW", true, 100, 4);
    }

    @Override
    public String startEngine() {
        return " BMW engine was started";
    }

    @Override
    public String accelerate(int acclerate) {
        return "Your car movement " + acclerate;
    }

    @Override
    public String theBreak() {
        return "Your bmw stop";
    }
}


class Ferrari extends Car {
    public Ferrari() {
        super("Ferrari", true, 500, 4);
    }

    @Override
    public String startEngine() {
        return "Ferrari engine was started";
    }

    @Override
    public String accelerate(int acclerate) {
        return "Ferrrari movement is " + acclerate;
    }

    @Override
    public String theBreak() {
        return "Ferrari was Stop";
    }
}

class Mercedes extends Car {
    public Mercedes() {
        super("Mercedes", true, 300, 4);
    }

    @Override
    public String startEngine() {
        return "Your Mercedes engine was started";
    }

    @Override
    public String accelerate(int acclerate) {
        return "Your Mercedes acceleration is " + acclerate;
    }

    @Override
    public String theBreak() {
        return "Your Mercedes was stop";
    }
}


public class Main {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            Car car = randomCars();
            System.out.println("Car #" + i + ": " + car.getName() + "\n" + "Engine: " +
                    car.startEngine() + "\n" + "Acceleration: " +
                    car.accelerate(100) + "\n" +
                    "Break: " + car.theBreak());
        }

    }

    public static Car randomCars() {
        int randomNumber = (int) (Math.random() * 3 ) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new BMW();
            case 2:
                return new Mercedes();
            case 3:
                return new Ferrari();
        }

        return null;
    }
}

































