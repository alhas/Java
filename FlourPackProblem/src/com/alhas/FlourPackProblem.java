package com.alhas;

public class FlourPackProblem {


    public static boolean canPack(int bigCount, int smallCount, int goal) {
        bigCount = bigCount * 5;


        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if (bigCount + smallCount + 1 == goal || bigCount + smallCount == goal || bigCount + smallCount - 1 == goal) {
            System.out.println("True");

            return true;
        } else return false;

    }
}
