package com.designPattern.behavioral.observer;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class ConcreteObserver implements IObserver {

    @Override
    public void update(Subject subject) {

        int n = subject.getSubjectState();

        //.....
    }
}
