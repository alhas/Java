package com.alhas;

import java.util.LinkedList;

public abstract class List {

    private LinkedList<String> LinkedList;

    public List(LinkedList<String> LinkedList){
        this.LinkedList = LinkedList;
    }

    public abstract void next();
    public abstract void previous();

    public java.util.LinkedList<String> getLinkedList() {
        return LinkedList;
    }
}
