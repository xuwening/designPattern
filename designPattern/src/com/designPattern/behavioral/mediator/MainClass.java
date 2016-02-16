package com.designPattern.behavioral.mediator;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class MainClass {

    public static void main(String[] argv) {

        FontDialogDirector dialogDirector = new FontDialogDirector();
        dialogDirector.showDialog();

        //test
        dialogDirector.sendMouseEvent();
    }
}
