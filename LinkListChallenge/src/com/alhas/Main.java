package com.alhas;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Album album = new Album();

        LinkedList<String> albumList = new LinkedList<String>();

        album.addInOrder(albumList, "album0");
        album.addInOrder(albumList, "album1");
        album.addInOrder(albumList, "album2");
        album.addInOrder(albumList, "album3");
        album.addInOrder(albumList, "album4");


        album.printList(albumList);

    }

}
