package com.designPattern.behavioral.chainOfResponsibility;

import java.awt.*;

/**
 * Created by hongjingjun on 16/2/16.
 */


enum EventType {

    TapEvent, SwipeEvent, PanEvent, RotationEvent, LongPressEvent, PinchEvent
};

public class UIEvent {


    private EventType eventType;

    public UIEvent(EventType eventType) {

        this.eventType = eventType;
    }

    public EventType getEventType() {

        return eventType;
    }

}
