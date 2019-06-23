package com.alhas;

public class SumDigits {

    public static int sumDigits(int number) {

        int sum = 0;

        if (number >= 10) {

            while (number > 0) {

                int n = number % 10;
                sum += n;
                number /= 10;
            }
            System.out.println(sum);

        } else return -1;

        return +1;
    }


}

