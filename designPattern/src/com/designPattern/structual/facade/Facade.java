package com.designPattern.structual.facade;

/**
 * Created by hongjingjun on 16/2/15.
 */

//意图
//为子系统中的一组接口提供一个一致的界面

public class Facade {

    private Object object = null;

    public void facadeAction() {

        ClassOne one = new ClassOne();
        ClassTwo two = new ClassTwo();
        ClassThree three = new ClassThree();

        one.businessAction(this);
        two.businessAction(this);
        three.businessAction(this);

        //其他处理...
    }

    public Object getResult() {

        return object;
    }
}
