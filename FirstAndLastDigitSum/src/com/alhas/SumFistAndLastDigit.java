package com.alhas;

public class SumFistAndLastDigit {


    public static int sumFirstAndLastDigit(int number) {


        int numbers = 0;

        if (number >= 10) {

            while (number > 0) {
                int check = number % 10;
                number /= 10;
                if (check % 2 == 0 && check > 0) {

                    numbers += check;

                }
                System.out.println(numbers);
            }



        } else return -1;


        return +1;
    }

}
