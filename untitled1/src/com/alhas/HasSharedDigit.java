package com.alhas;

public class HasSharedDigit {

    public static boolean hasSharedDigit(int input1, int input2) {

        int lastdigit2 = 0;
        int lastdigit1 = 0;
        if ((input1 >= 10 && input1 <= 99) && (input2 >= 10 && input2 <= 99)) {

            if (input1 > 10) {
                lastdigit1 = input1 % 10;
                while (input1 > 10) {
                    input1 /= 10;
                }
            }
            if (input2 > 10) {
                lastdigit2 = input2 % 10;
                while (input2 > 10) {
                    input2 /= 10;
                }
            }
            if (lastdigit1 == lastdigit2) {
                System.out.println(lastdigit1);
                return true;
            } else if (input1 == input2) {
                System.out.println(input1);
                return true;
            }else if(input1 == lastdigit2 ){
                System.out.println(input1);
            }else if(input2 == lastdigit1){
                System.out.println(input2);
            }
        } else return false;

        return true;
    }


}
