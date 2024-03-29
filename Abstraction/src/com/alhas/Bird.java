package com.alhas;

public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breath() {

        System.out.println("Breath in, breath");

    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping it wings.");
    }
}
