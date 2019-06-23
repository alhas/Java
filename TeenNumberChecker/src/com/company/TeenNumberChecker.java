package com.company;

public class TeenNumberChecker {

    public static boolean hasTeen(int teenOne, int teenTwo, int teenThree){

        if (teenOne >= 13 && teenOne <= 19 || teenTwo >=13 && teenTwo <=19 || teenThree >= 13 && teenThree <= 19){

            System.out.println("Ergen Bulundu.");


        }else return false;


        return true;
    }


}
