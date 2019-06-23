package com.alhas;


import java.util.*;

public class Main {

    public static void main(String[] args) {


        ArrayList<Album> albums = new ArrayList<Album>(); // Album ArrayList we will adds our albums.

        Album album = new Album("Storm bringer", "DeepPurple"); // creating new album class name calls constructor.
        album.addSong("Storm bringer", 4.6); // adding new songs with addSong method.
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);// and last album song adds albums ArrayList.

        album = new Album("For those about to rock", "AC/DC");// Same story.
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 5.44);
        album.addSong("Lets go", 5.44);
        album.addSong("Inject the venom", 5.44);
        album.addSong("Snowballed", 5.44);
        album.addSong("Evil walks", 5.44);
        album.addSong("C.O.D.", 5.44);
        album.addSong("Breaking the rules", 5.44);
        album.addSong("Night of the long knives", 5.44);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>(); // creat playlist with LinkedList. Object is Song.
        albums.get(0).addToPlaylist("You can't di it right", playList);
        albums.get(0).addToPlaylist("Holy man", playList);// playlistNames
        albums.get(0).addToPlaylist("Speed king", playList); //Does not exist
        albums.get(0).addToPlaylist(9, playList);// overLoading methods works this step. add tracks from albums and calls addtoplaylist method and gives the parameters.
        albums.get(1).addToPlaylist(8, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(24, playList);

        play(playList);// calls play method with playList parameter Linked list goes.


    }


    private static void play(LinkedList<Song> playList) { //Linked list goes playList this step.
        Scanner scanner = new Scanner(System.in); // Scanner created.
        boolean quit = false; // logical statements created.
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator(); //litIterator called for iterate playlist.
        if (playList.size() == 0) { // if playlist has't playlist goes error.
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString()); // list iterator goes next step calls with String type.
            printMenu();
        }

        while (!quit) { // menu statement
            int action = scanner.nextInt(); //Action var is scant next integer for decide which menu calls.
            scanner.nextLine();// scanner goes next line.

            switch (action) { //switch statement helps us for which number scanned.
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {// if forward is false
                        if (listIterator.hasNext()) { // list iterator goes next index number.
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {// if list iterator has next.
                        System.out.println("Now playing " + listIterator.next().toString()); // which sound is playing shows.
                    } else {
                        System.out.println("We have reached the end of the playlist."); // if we don't have anymore sound else statement works.

                    }
                    break;
                case 2:
                    if (forward) { // if forward is true
                        if (listIterator.hasPrevious()) { // iterator goes back sound.
                            listIterator.previous();
                        }
                        forward = false; //forward equals to false.
                    }
                    if (listIterator.hasPrevious()) { // list iterator if previous statement
                        System.out.println("Now playing " + listIterator.previous().toString()); // plays list iterator previous.
                    } else {
                        System.out.println("We are at the start of the playlist."); // if we don't have song this message shows.
                        forward = true;// forward logical statement goes true for "hasnext"
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached end of the list.");
                        }
                    }
                    break;
                case 4:
                    printList(playList);// calls print list method.
                    break;
                case 5:
                    printMenu(); // this case calls printMenu method.
                    break;
                case 6:
                    if (playList.size() > 0) { // this is remove statement if playlist size bigger than 0
                        listIterator.remove(); // list iterator removes playlist.
                        if (listIterator.hasNext()) { // this statement shows next playlist.
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }


    private static void printMenu() {// print menu method show our choices.
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.");
    }


    private static void printList(LinkedList<Song> playList) { // printList prints playlist which has songs.
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==========================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("==========================================");
    }


}




















