package com.alhas;

public class Main {

    public static void main(String[] args) {

        Bakery bakery = new Bakery("Ariston");
        Cabinet cabinet = new Cabinet("maple", 120, 100);
        Furniture furniture = new Furniture("Bosch", 190, 90);
        Table table = new Table(120, 110);

        Kitchen kitchen = new Kitchen(cabinet, furniture, bakery, table, "Normal");

        kitchen.howIsGoingInKitchen();


    }
}
