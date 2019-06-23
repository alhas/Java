package com.company;


public class mitunesToDate {

    private static final String INVALID_VALUE = "Invalid Value";

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {

            System.out.println(INVALID_VALUE);

        }
        long hours = minutes / 60;
        long Days = hours / 24;
        long Years = Days / 365;
        long remainingDays = Days % 365;

        String daysString = remainingDays + "D";
        if (remainingDays < 10) {

            daysString = "0" + daysString;
        }

        String yearString = Years + "Y";
        if (Years < 10) {

            yearString = "0" + yearString;
        }

        System.out.println(yearString + " " + daysString);
    }


}
