package com.designPattern.behavioral.mediator;

import apple.laf.JRSUIConstants;

/**
 * Created by hongjingjun on 16/2/16.
 */

//意图
//用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用,从 而使其耦合松散,而且可以独立地改变它们之间的交互

public interface IDialogDirector {

    public void showDialog();
    public void widgetChanged(Widget widget);
}
