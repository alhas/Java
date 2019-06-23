package com.alhas;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
            this.width = width;
        } else {
            this.width = width;
        }
    }

    public void setLength(double length) {
        if (length < 0) {
            length = 0;
            this.length = length;
        } else {
            this.length = length;
        }
    }

    public double getWidth(){
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return width * length;
    }
}
