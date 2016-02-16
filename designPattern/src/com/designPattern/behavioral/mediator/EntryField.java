package com.designPattern.behavioral.mediator;

import java.awt.event.MouseEvent;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class EntryField extends Widget {

    private String text = "";

    public EntryField(IDialogDirector dialogDirector) {

        super(dialogDirector);
    }

    public void setText(String text) {

        this.text = text;
        System.out.println("EntryField text changed: " + text);
    }

    @Override
    public void handleMouse(MouseEvent event) {

    }
}
