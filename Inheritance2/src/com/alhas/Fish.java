package com.alhas;

// Fish inheritance from Animal class and added new arguments.
public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    // Constructor called.
    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        //Standard animal features filled.
        super(name, 1, 1, size, weight);
        // new arguments called from constructor.
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }


    private void rest() {

    }

    // added new method for fish movement.
    private void moveMuscles() {

    }


    private void moveBackFin() {


    }

    // these methods are helps to fish for swiming.
    private void swim(int speed) {
        // all methods called.
        moveMuscles();
        moveBackFin();
        // super used for return statement.
        super.move(speed);


    }


}
