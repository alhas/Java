package com.alhas;

public class Vehichle {

    private String body;
    private int wheels;
    private int engine;
    private String color;
    private int heavy;
    private int speed;
    private int tork;

    public Vehichle(String body, int wheels, int engine, String color, int heavy, int speed, int tork) {
        this.body = body;
        this.wheels = wheels;
        this.engine = engine;
        this.color = color;
        this.heavy = heavy;
        this.speed = speed;
        this.tork = tork;
    }


    public void setBody(String body) {
        this.body = body;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeavy(int heavy) {
        this.heavy = heavy;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setTork(int tork) {
        this.tork = tork;
    }

    public String getBody() {
        return body;
    }

    public int getWheels() {
        return wheels;
    }

    public int getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getHeavy() {
        return heavy;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTork() {
        return tork;
    }



}
