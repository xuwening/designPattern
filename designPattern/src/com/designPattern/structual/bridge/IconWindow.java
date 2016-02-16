package com.designPattern.structual.bridge;

/**
 * Created by hongjingjun on 16/2/14.
 */
public class IconWindow extends Window {

    public void drawBorder() {

        drawRect();
        drawText();
    }
}
