package com.designPattern.structual.flyweight;

/**
 * Created by hongjingjun on 16/2/15.
 */

//意图
//运用共享技术有效地支持大量细粒度的对象

public interface Flyweight {

    public void operation(Object extrinsicState);
}
