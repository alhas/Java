package com.alhas;


import com.example.game.ISaveable;
import com.example.game.Monster;
import com.example.game.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player tim = new Player("Tim", 10, 15, "Sword");
        System.out.println(tim);
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Storm bringer");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(((Monster) werewolf).getStrength());
        saveObject(werewolf);


    }


    public static ArrayList<String> readValue() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");


        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }

        return values;
    }


    private static void saveObject(ISaveable save) {
        for (int i = 0; i < save.write().size(); i++) {
            System.out.println("Saving " + save.write().get(i) + " to storage device");
        }
    }


    private static void loadObject(ISaveable objectToLoad) {
        List<String> values = readValue();
        objectToLoad.read(values);
    }


}
