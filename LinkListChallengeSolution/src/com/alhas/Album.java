package com.alhas;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name; // Name and String vars, for album.
    private String artist;

    private ArrayList<Song> songs; //ArrayList for songs ArrayList object is calls song. ArrayList name is songs.

    public Album(String name, String artist) { // constructor for our
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>(); // songs refer the ArrayList songs.
    }

    public boolean addSong(String title, double duration) { // add songs duration and title. method is boolean it is important for methods works.
        if (findSong(title) == null) { //goes findSong method if it is null add new song.
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) { //  method is fondSong from Song ArrayList object.
        for (Song checkedSong : this.songs) { // this.song checks all songs
            if (checkedSong.getTitle().equals(title)) { // if it is same with our title Parameter
                return checkedSong; // returned song name
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {  // our parameter type int trackNumber and LinkedList playList
        int index = trackNumber - 1; //LinkList Index is starts 0. -1 means of that.
        if ((index >= 0) && (index <= this.songs.size())) { // if index number bigger and equal than 0, AND index smaller and equal sings.size()
            playList.add(this.songs.get(index));// ArrayList .add method calls and implement song by index number.
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber); // Other wise return error.

        return false;
    }


    public boolean addToPlaylist(String title, LinkedList<Song> playList) {// OverLoading with boolean method type.
        Song checkedSong = findSong(title);// This time checked song calls find song by title.
        if (checkedSong != null) { // if it's empty
            playList.add(checkedSong); // add checkedSong
            return true;
        }

        System.out.println("The song " + title + " is not in this album"); // Other wise return error message.
        return false;
    }


}























