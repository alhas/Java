package com.alhas;

public class LasDigitChecker {

    private static boolean isValid(int valid) {

        if (valid >= 10 && valid < 1000) {
            return true;
        } else return false;

    }

    public static boolean hasSameLastDigit(int imp0, int imp1, int imp2) {


        if (isValid(imp0) || isValid(imp1) || isValid(imp2)) {

            int lastdigit0 = imp0 % 10;
            int lastdigit1 = imp1 % 10;
            int lastdigit2 = imp2 % 10;

            if (lastdigit0 == lastdigit1 && lastdigit1 == lastdigit2){
                System.out.println("Last digits are equal");
                return true;
            }

        }else return false;
        return false;
    }
}
