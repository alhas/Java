package com.alhas;

public class Table {


    private int height;
    private int width;

    public Table(int heigt, int width) {
        this.height = heigt;
        this.width = width;
    }

    public void onTable(String x, String y) {
        System.out.println(x + " " + y + " on the table.");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
