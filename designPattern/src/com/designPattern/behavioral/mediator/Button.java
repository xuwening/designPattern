package com.designPattern.behavioral.mediator;

import java.awt.event.MouseEvent;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class Button extends Widget {

    public Button(IDialogDirector dialogDirector) {
        super(dialogDirector);
    }

    @Override
    public void handleMouse(MouseEvent event) {

    }
}
