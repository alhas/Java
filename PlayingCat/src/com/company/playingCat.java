package com.company;

public class playingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer == true && (temperature > 25 && temperature <= 35)) {

            System.out.println("Cat can play in this temperature.");
            return true;
        } else System.out.println("Cat can't play this temperature.");
        return false;

    }
}
