package com.designPattern.structual.proxy;

/**
 * Created by hongjingjun on 16/2/15.
 */

//意图
//为其他对象提供一种代理以控制对这个对象的访问

public interface Graphic {

    public void draw();
    public Object store();
    public void load();
}
