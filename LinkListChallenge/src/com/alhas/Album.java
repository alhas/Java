package com.alhas;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {



    public static boolean addInOrder(LinkedList<String> linkedList, String newAlbum) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newAlbum);
            if (comparison == 0) {
                System.out.println(newAlbum + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newAlbum);
                return true;
            } else if (comparison < 0) {

            }
        }
        stringListIterator.add(newAlbum);
        return true;
    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Your album is " + i.next());
        }
        System.out.println("=====================");
    }
}
