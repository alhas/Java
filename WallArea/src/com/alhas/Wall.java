package com.alhas;

public class Wall {

    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {

        if (width < 0 || height < 0) {
            width = 0;
            height = 0;
        } else {
            this.width = width;
            this.height = height;
        }

    }

    public double getArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {

        this.width = width;
        if (width < 0) {
            setWidth(0);
        }
    }

    public void setHeight(double height) {
        this.height = height;
        if (height < 0) {
            setHeight(0);

        }
    }

}
