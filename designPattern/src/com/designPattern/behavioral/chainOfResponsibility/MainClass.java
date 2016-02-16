package com.designPattern.behavioral.chainOfResponsibility;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class MainClass {

    public static void main(String[] argv) {

        UIView window = new UIView();

        UIView view = new UIView();
        UILabel label = new UILabel();
        UIButton button = new UIButton();

        view.addSubView(label);
        view.addSubView(button);

        window.addSubView(view);

        //test
        label.handleUIEvent(new UIEvent(EventType.TapEvent));  //label
        label.handleUIEvent(new UIEvent(EventType.SwipeEvent)); //view
    }
}
