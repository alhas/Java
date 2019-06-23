package com.alhas;

public class Hamburgers {

    private String name;
    private double price;
    private String bread;
    private String mead;
    public int lettuce;
    public int tomato;
    public int cheese;
    double addPrice;

    public Hamburgers(String name, double price, String bread, String mead, int lettuce, int tomato, int cheese) {
        this.name = name;
        this.price = price;
        this.bread = bread;
        this.mead = mead;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.cheese = cheese;
    }

    public void additions() {

        addPrice = lettuce * 0.50 + tomato * 0.50 + cheese * 0.50;
        System.out.println("You additions " + this.lettuce + " lettuce," + this.tomato + " tomato, and " + this.cheese + " cheese"
                + " your addition price is " + addPrice + "$");
    }


    public void totalPrice() {
        double totalPrice = price + addPrice;
        System.out.println("You bought " + name + " your total price is " + totalPrice + "$");
    }
}

class basicBurger extends Hamburgers {

    public basicBurger(String bread, String mead, int lettuce, int tomato, int cheese) {
        super("Basic Burger", 10, bread, mead, lettuce, tomato, cheese);

    }

    @Override
    public void additions() {
        super.additions();
    }

    @Override
    public void totalPrice() {
        super.totalPrice();
    }
}


class healthyBurger extends Hamburgers {

    private int carrot;

    public healthyBurger(String bread, String mead, int lettuce, int tomato, int cheese, int carrot) {
        super("Healthy Burger", 12, bread, mead, lettuce, tomato, cheese);
        this.carrot = carrot;

    }

    public void additions() {

        addPrice = lettuce * 0.50 + tomato * 0.50 + cheese * 0.50+ carrot * 0.50;
        System.out.println("Your additions: " + this.lettuce + " lettuce," + this.tomato + " tomato," + this.cheese + " cheese, "
                + this.carrot +" carrot"+" your addition price is " + addPrice + "$");
    }


    @Override
    public void totalPrice() {
        super.totalPrice();
    }
}

class deluxeBurger extends Hamburgers {
    private String cola;
    private String patatoes;

    public deluxeBurger(String bread, String mead, String cola, String patatoes) {
        super("Deluxe Burger", 15, bread, mead, 1, 1, 1);
        this.cola = cola;
        this.patatoes = patatoes;

    }

    @Override
    public void additions() {
        super.additions();
    }

    @Override
    public void totalPrice() {
        super.totalPrice();
    }
}
























