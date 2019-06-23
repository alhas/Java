package com.alhas;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            radius = 0;
            this.radius = radius;
        } else {
            this.radius = radius;

        }

    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

}
