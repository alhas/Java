package com.company;



public class Main {





    public static void main(String[] args) {

        int newScore = calculateScore("Tim ", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();

        calculateFeedAndInches.calcFeetAndIncherToCentimetersOne(11,5);

        calculateFeedAndInches.calcFeetAndIncherToCentimetersOne(12);

        calculateFeedAndInches.calcFeetAndInchesToCentimeters(100);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + score + " points");
        return score * 1000;

    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }





}

