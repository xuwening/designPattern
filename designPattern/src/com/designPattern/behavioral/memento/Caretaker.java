package com.designPattern.behavioral.memento;

import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class Caretaker {

    private Memento memento;
    private ArrayList<Memento> mementos = new ArrayList<Memento>();

    public void pushMemento(Memento memento) {

        mementos.add(memento);
    }

    public Memento pop() {

        return mementos.get(mementos.size()-1);
    }
}
