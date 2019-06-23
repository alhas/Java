package com.alhas;

public class Floor {

    private double width;
    private double length;

    Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
        if (width < 0) {
            setWidth(0);
        }
    }

    public void setLength(double length) {
        this.length = length;
        if (length < 0) {
            setLength(0);
        }
    }


    public double getArea(){
        return (width*length);
    }





}
