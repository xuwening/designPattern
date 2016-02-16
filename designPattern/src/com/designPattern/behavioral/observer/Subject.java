package com.designPattern.behavioral.observer;

import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class Subject {

    private ArrayList<IObserver> observers = new ArrayList<IObserver>();

    public void attach(IObserver observer) {

        observers.add(observer);
    }

    public void detach(IObserver observer) {

        observers.remove(observer);
    }

    public void notified() {

        for (IObserver observer : observers) {

            observer.update(this);
        }
    }

//==================================================

    private int subjectState = 0;

    public void setSubjectState(int state) {
        this.subjectState = state;
    }

    public int getSubjectState() {
        return subjectState;
    }

}
