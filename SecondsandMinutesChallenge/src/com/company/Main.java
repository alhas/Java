package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static final String INVALID_VALUE_MESSAGE = "INVALID VALUE";

    public static void main(String[] args) {

        System.out.println(getDurationString(200, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));

    }

    private static String getDurationString(long minutes, long seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;

        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {

            hoursString = "0" + hoursString;
        }

        String mitunesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {

            mitunesString = "0" + mitunesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + mitunesString + " " + secondsString + " ";
    }

    private static String getDurationString(long seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);

    }

//    public static boolean getDurationString(double minutes, double seconds) {
//
//        if ((minutes >= 0) && seconds >= 0 && seconds <= 59) {
//            double hours = 3600;
//            double secondsConverter = minutes * 60;
//            double minutesToHourConverter = secondsConverter + seconds;
//            double Total = ((minutesToHourConverter / hours) * 60);
//
//            System.out.println(minutes + " min + " + seconds + " Sec = " + Total);
//
//
//        } else {
//
//            System.out.println("Invalid Value");
//        }
//
//        return false;
//    }

}
