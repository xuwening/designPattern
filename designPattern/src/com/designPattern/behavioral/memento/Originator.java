package com.designPattern.behavioral.memento;

/**
 * Created by hongjingjun on 16/2/16.
 */

class State {

}

public class Originator {

    private State state;

    public Originator() {
        this.state = new State();
    }

    public Memento createMemento() {

        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        state = memento.getState();
    }
}
