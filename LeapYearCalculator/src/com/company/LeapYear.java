package com.company;

public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {

                        System.out.println(year + " This Year is a leap year.");

                    } else System.out.println(year + " This Year not is a leap year.");

                } else System.out.println(year + " This Year is not leap year.");

            } else System.out.println(year + " This Year is a leap year.");


        } else return false;


        return true;
    }


}
