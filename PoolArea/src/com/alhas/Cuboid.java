package com.alhas;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length,double height){
        super(width,length);
        this.height = height;
    }


    public void setHeight(double height){
        if(height < 0){
            height = 0;
            this.height = height;
        }else{
            this.height = height;
        }
    }


    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return height * getArea();
    }



}
