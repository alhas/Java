package com.alhas;

public class mercedes extends Car {

    private String Spoiler;

    public mercedes(String body, int wheels, int engine, String color, int heavy, int speed, int tork, int size, String spoiler) {
        super(body, wheels, engine, color, heavy, speed, tork, size);
        this.Spoiler = spoiler;
    }


    @Override
    public void engineStart() {
        super.engineStart();
    }

    @Override
    public void gasPedal() {
        super.gasPedal();
    }

    @Override
    public void move(int speed) {
        super.move(speed);
    }

    public void stop(){
        System.out.println("Car stop");
    }
}


