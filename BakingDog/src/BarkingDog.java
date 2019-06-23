public class BarkingDog {


    public static boolean shouldWAkeUp(boolean barking, int hoursOfDay) {

        if (hoursOfDay <= 8 && hoursOfDay >= 22) {
            return barking = true;
        } else return false;


    }

}
