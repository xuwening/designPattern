package com.designPattern.structual.bridge;

/**
 * Created by hongjingjun on 16/2/14.
 */

//意图
//将抽象部分与它的实现部分分离,使它们都可以独立地变化

public class Window {

    private IWindowImp imp = null;

    public void setImp(IWindowImp imp) {
        this.imp = imp;
    }

    public void drawText() {
        imp.devDrawText();
    }

    public void drawRect() {

        //简单代码,省略 rect等细节
        imp.devDrawLine();
        imp.devDrawLine();
        imp.devDrawLine();
        imp.devDrawLine();
    }
}
