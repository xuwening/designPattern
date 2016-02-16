package com.designPattern.behavioral.memento;

/**
 * Created by hongjingjun on 16/2/16.
 */

//意图
//在不破坏封装性的前提下,捕获一个对象的内部状态,并在该对象之外保存这个状态。 这样以后就可将该对象恢复到原先保存的状态

public class Memento {

    private State state;

    public Memento(State state) {

        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
