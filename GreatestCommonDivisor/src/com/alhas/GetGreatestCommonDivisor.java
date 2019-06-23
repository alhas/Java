package com.alhas;

public class GetGreatestCommonDivisor {

    public static void printFactors(int number) {

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                  int  divider = i;
                    System.out.println(divider + " is divide" );
                }
            }
        }else System.out.println("Invalid Value");

    }
}








