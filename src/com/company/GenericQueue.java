package com.company;

import java.util.ArrayList;

public class GenericQueue<E> {
    ArrayList<E> elements;

    public GenericQueue() {
        this.elements = new ArrayList<>();
    }

    public void push(E x){
        elements.add(x);
    }

    public E front(){
        return elements.get(0);
    }

    public void pop(){
        elements.remove(0);
    }

    public int size(){
        return elements.size();
    }

    public boolean empty(){
        return elements.size() == 0;
    }
}
