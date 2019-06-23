package com.alhas;

public class Main {

    public static void main(String[] args) {

        basicBurger basicBurger = new basicBurger("White","beef",0,2,2);
        basicBurger.additions();
        basicBurger.totalPrice();


        healthyBurger healthyBurger = new healthyBurger("brown","Chicken",1,2,3,1);
        healthyBurger.additions();
        healthyBurger.totalPrice();


        deluxeBurger deluxeBurger = new deluxeBurger("White","pork","pepsi","normal");
        deluxeBurger.additions();
        deluxeBurger.totalPrice();




    }
}
