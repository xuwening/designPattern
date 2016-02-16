package com.designPattern.behavioral.mediator;

import java.awt.event.MouseEvent;

/**
 * Created by hongjingjun on 16/2/16.
 */

public class FontDialogDirector implements IDialogDirector {

    private Button ok;
    private Button cancel;
    private ListBox fontList;
    private EntryField fontName;

    public FontDialogDirector() {

        createWidgets();
    }

    protected void createWidgets() {

        ok = new Button(this);
        cancel = new Button(this);
        fontList = new ListBox(this);
        fontName = new EntryField(this);
    }

    @Override
    public void showDialog() {

        //show...
    }

    @Override
    public void widgetChanged(Widget widget) {

        if (widget == fontList) {

            fontName.setText( fontList.getSelection() );

        } else if (widget == ok) {

            //apply...

        } else if (widget == cancel) {

            //dismiss dialog
        }
    }


    //test
    public void sendMouseEvent() {
        fontList.addOption("aaaaaaaaaa");
        fontList.addOption("bbbbbbbbbb");
        fontList.addOption("cccccccccc");
        fontList.addOption("dddddddddd");

        fontList.handleMouse(null);
    }
}
