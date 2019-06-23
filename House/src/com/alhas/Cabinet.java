package com.alhas;

public class Cabinet {


    private String wood;
    private int width;
    private int height;

    public Cabinet(String wood, int width, int height) {
        this.wood = wood;
        this.width = width;
        this.height = height;
    }

    public String getWood() {
        return wood;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
