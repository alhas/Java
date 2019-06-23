package com.company;


public class DecimalComparator {


    public static boolean areEqualByThreeDecimalPlaces(double parameterOne, double parameterTwo) {



        if ((parameterOne == parameterTwo)) {

            System.out.println(parameterOne + " - " + parameterTwo + " True");

            return (((int)(parameterOne * 1000) == ((int)(parameterTwo * 1000))));
        } else return false;


    }


}
