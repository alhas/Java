package com.alhas;

public class LargestPrime {


    public static int getLargestPrime(long num) {


        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            //if i is a factor, check if its prime
            if (num % i == 0) {
                for (int j = 2; j < i; j++) {

                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    System.out.println(i);
                }
            }
        }
        System.out.println(i);

    }
}


