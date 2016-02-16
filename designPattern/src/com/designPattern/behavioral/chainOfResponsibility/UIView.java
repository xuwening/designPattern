package com.designPattern.behavioral.chainOfResponsibility;

import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/16.
 */


public class UIView extends Responder {

    private ArrayList<UIView> subViews;

    //test
    protected EventType canProcessEventType;

    public UIView() {

        super(null);
        subViews = new ArrayList<UIView>();

        canProcessEventType = EventType.SwipeEvent;
    }

    @Override
    public boolean canResponse(UIEvent event) {

        //test
        if (event.getEventType() == canProcessEventType) {
            return true;
        }

        return false;
    }

    @Override
    public void handleRequest(UIEvent event) {

        switch (event.getEventType()) {

            case TapEvent:
                break;
            case SwipeEvent:
                break;
            case PanEvent:
                break;
            case RotationEvent:
                break;
            case LongPressEvent:
                break;
            case PinchEvent:
                break;
            default:
                break;
        }
    }

    public void addSubView(UIView uiView) {

        assert uiView != null;

        if (subViews.contains(uiView)) {
            return;
        }

        subViews.add(uiView);

        uiView.nextResponder = this;
    }

    public void setCanProcessEventType(EventType eventType) {
        this.canProcessEventType = eventType;
    }

    public EventType getCanProcessEventType() {
        return canProcessEventType;
    }

    //test
    public void sendEvent(UIEvent event) {

        handleUIEvent(event);
    }
}
