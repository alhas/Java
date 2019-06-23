public class ByteShortInt {

    public static void main(String[] args) {

        // int has a with of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal =" + myTotal);
        // byte has a width of 8
        byte myByteValue = -128;
        int myNewByteValue = (byte)(myByteValue/2);
        System.out.println("myNewValue = " + myNewByteValue);

        //short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue / 2);
        System.out.println("myNewShortValue = "+myNewShortValue);
        //long has a width of 64
        long myLongValue = 1001;


        byte bytevalue = 127;

        short myshort = 32767;

        int tobyte = (byte) (32);

        long longNumber = 50000L +10L * (bytevalue + myshort + tobyte);

        System.out.println(longNumber);











    }
}
