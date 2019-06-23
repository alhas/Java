package com.alhas;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Yourkie");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("Papagan");
        parrot.fly();
        parrot.breath();
        parrot.eat();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}
