package com.alhas;

public class IsPalindrome {

    public static boolean isPalidrome(int number) {
        int reverse = number;
        int sum = 0;
        while (number > 0) {

           int n = number % 10;
            sum = (sum * 10) + n;
            number /= 10;
        }

        if (reverse == sum) {
            System.out.println("Palindome Number");
            return true;
        } else {
            System.out.println("Not Palindrome");
            return false;
        }


    }


}
