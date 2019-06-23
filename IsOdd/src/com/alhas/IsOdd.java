package com.alhas;

public class IsOdd {


    public static boolean idOdd(int number) {


        if (number < 0) {
            return false;

        } else if (number % 2 == 1) {
            return true;


        } else return false;

    }





    public static int sumOdd(int start, int end) {

        int sum = 0;

        if (end >= start && start > 0) {
            for (int i = start; i <= end; i++) {
                if (idOdd(i)) {
                    sum += i;
                }
                System.out.println(sum);
                    return sum;
            }

        }

     return -1;
    }


}
