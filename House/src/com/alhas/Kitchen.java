package com.alhas;

public class Kitchen {

    private Cabinet cabinet;
    private Furniture furniture;
    private Bakery bakery;
    private Table table;
    private String sink;

    public Kitchen(Cabinet cabinet, Furniture furniture, Bakery bakery, Table table, String sink) {
        this.cabinet = cabinet;
        this.furniture = furniture;
        this.bakery = bakery;
        this.table = table;
        this.sink = sink;
    }

    public void howIsGoingInKitchen(){
        System.out.println("Door open.");
        thefurniture();
        thebakery();
    }

    private void thefurniture(){
        furniture.furnitureIsOpen();
    }
    private void thebakery(){
        bakery.bakeryWorking("Cake");
    }
}
