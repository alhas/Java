package com.company;

public class EqualSumChecker {

    public static boolean hasEqualSum(int pOne, int pTwo, int pThree) {

        if (pOne + pTwo == pThree) {
            System.out.println(pOne + " + " + pTwo + " = " + pThree + " True");
        } else return false;

        return true;
    }

}


