package com.company;

public class BarkingDog {


    public static boolean shouldWAkeUp(boolean barking, int hoursOfDay) {

        if (barking == true && hoursOfDay <= 8 || hoursOfDay <= 22) {
            System.out.println(barking + " " + hoursOfDay);
            return true;
        } else if (barking == false && hoursOfDay <= 0 || hoursOfDay > 23) {

            System.out.println(barking + " " + hoursOfDay);

            return false;

        } else System.out.println("This is not possible.");

        return false;
    }
}
