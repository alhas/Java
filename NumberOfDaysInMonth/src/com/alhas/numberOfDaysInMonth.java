package com.alhas;

public class numberOfDaysInMonth {


    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12) {
            System.out.println("INVALID MONTH");
            return -1;
        } else if (year < 1 || year > 9999) {
            System.out.println("INVALID YEAR");
            return -1;
        } else if (year % 4 == 0 || year % 400 == 0 && month == 2) {

            System.out.println("February - 29 is a leap year " + year);
        } else if (month == 1) {

            System.out.println("January - 31 " + year);

        } else if (year % 4 != 0 || year % 400 != 0 && month == 2) {
            System.out.println("February - 28  " + year);
        }


        return 1;
    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999 && (year % 4 == 0 && year % 400 == 0)) {

            System.out.println("This year is loop year");
            return true;

        } else System.out.println("This is not loop year");
        return false;

    }
}
