package com.alhas;

public class Main {

    public static void main(String[] args) {


        int sum = 0;
        int n = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                n++;
                sum += i;
                System.out.println(i + " = Number Can divide by 5 and 3");
                if (n == 90) {
                    break;

                }

            }

        }

        System.out.println("Result is " + sum);

    }

}

