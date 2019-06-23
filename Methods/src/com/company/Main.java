package com.company;

public class Main {

    public static void main(String[] args) {

        calculateHighScorePosition(400);
        calculateHighScorePosition(1000);
        calculateHighScorePosition(500);
    }


    public static String displayHighScorePosition(String nameOne, String position) {

        return nameOne + position;
    }




    public static void calculateHighScorePosition(int scoreone) {

        if (scoreone >= 1000) {
            System.out.println("Player = " + displayHighScorePosition("Ali ", "Right ") + scoreone + " Point" );
        } else if (scoreone >= 500 && scoreone <= 1000) {
            System.out.println("Player = " + displayHighScorePosition("Bahtiyar ", "Left ") + scoreone + " Point");
        } else
            System.out.println("Player = " + displayHighScorePosition("Hakan ", "Middle ") + scoreone + " Point");


//    public static int calculateScore(boolean gameOver, int score, int levelComplated, int bonus) {
//
//        if (gameOver) {
//            int finalScore = score + (levelComplated * bonus);
//            finalScore += 1000;
//            return finalScore;
//        } else {
//            return -1;
//        }
//
//
//    }


    }
}
