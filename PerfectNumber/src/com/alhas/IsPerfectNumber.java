package com.alhas;

public class IsPerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }
        int total = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(total + " is perfect number");
            return true;
        }
        return false;
    }


}
