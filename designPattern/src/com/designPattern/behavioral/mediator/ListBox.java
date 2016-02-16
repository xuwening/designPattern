package com.designPattern.behavioral.mediator;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/16.
 */


public class ListBox extends Widget {

    private ArrayList<String> list;
    private int currentSelect;

    public ListBox(IDialogDirector dialogDirector) {

        super(dialogDirector);

        currentSelect = 0;
        list = new ArrayList<String>();
    }

    public String getSelection() {

        return list.get(currentSelect);
    }

    public void addOption(String optioin) {

        list.add(optioin);
    }

    @Override
    public void handleMouse(MouseEvent event) {

        //test
        currentSelect = 2;
        changed(); //通知中介者
    }
}
