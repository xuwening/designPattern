package com.designPattern.behavioral.chainOfResponsibility;

/**
 * Created by hongjingjun on 16/2/16.
 */

public class UIButton extends UIView {

    public UIButton() {

        super();

        //test
        canProcessEventType = EventType.LongPressEvent;
    }
}
