package com.designPattern.behavioral.mediator;

import java.awt.event.MouseEvent;

/**
 * Created by hongjingjun on 16/2/16.
 */



abstract public class Widget {

    private IDialogDirector dialogDirector;

    public Widget(IDialogDirector dialogDirector) {

        this.dialogDirector = dialogDirector;
    }

    public void changed() {

        dialogDirector.widgetChanged(this);
    }

    abstract public void handleMouse(MouseEvent event);
}
