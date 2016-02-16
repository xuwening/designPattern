package com.designPattern.behavioral.memento;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class MainClass {

    public static void main(String[] argv) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        //在 client 侧隐藏内部状态 State

        //保存
        Memento memento = originator.createMemento();
        caretaker.pushMemento(memento);

        //恢复
        memento = caretaker.pop();
        originator.restoreMemento(memento);
    }
}
