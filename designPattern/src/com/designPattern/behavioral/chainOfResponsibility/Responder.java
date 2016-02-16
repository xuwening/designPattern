package com.designPattern.behavioral.chainOfResponsibility;

/**
 * Created by hongjingjun on 16/2/16.
 */

//意图
//使多个对象都有机会处理请求,从而避免请求的发送者和接收者之间的耦合关系

abstract public class Responder {

    protected Responder nextResponder;

    public Responder(Responder nextResponder) {

        this.nextResponder = nextResponder;
    }

    abstract public boolean canResponse(UIEvent event);
    abstract public void handleRequest(UIEvent event);
    public void handleUIEvent(UIEvent event) {

        if (canResponse(event)) {

            //process...
            handleRequest(event);
            System.out.println(this.toString() + ": process " + event.toString());
        } else if (nextResponder != null) {

            nextResponder.handleUIEvent(event);
        }
    }
}
