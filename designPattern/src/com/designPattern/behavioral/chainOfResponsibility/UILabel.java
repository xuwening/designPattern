package com.designPattern.behavioral.chainOfResponsibility;

/**
 * Created by hongjingjun on 16/2/16.
 */


public class UILabel extends UIView {

    public UILabel() {
        super();

        //test
        canProcessEventType = EventType.TapEvent;
    }
}
