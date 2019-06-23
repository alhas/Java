package com.alhas;

public class Carpet {

    private double cost;

    Carpet(double cost){
        this.cost = cost;
    }

    public void setCost(double cost) {
        this.cost = cost;

        if(cost < 0){
            setCost(0);
        }
    }

    public double getCost(){

        return cost;

    }

}
