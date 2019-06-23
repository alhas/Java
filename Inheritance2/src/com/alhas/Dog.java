package com.alhas;


//referance from Animal
public class Dog extends Animal {


    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //super used for called arguments.
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }
    //Eat method Override it from Animal Class.

    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called.");
        // move method called for movement. Used super because we don't want to fill our memory.
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called.");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called.");
    }

    // Move Override it from Animal Class and added new arguments.
    @Override
    public void move(int speed) {

        System.out.println("Dog.move() called.");
        moveLegs(speed);
        // move method returned to self.
        super.move(speed);
    }
}
