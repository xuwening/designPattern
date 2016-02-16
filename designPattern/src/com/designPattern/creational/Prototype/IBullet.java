package com.designPattern.creational.Prototype;

/**
 * Created by hongjingjun on 16/2/13.
 */

//意图
//用原型实例指定创建对象的种类,并且通过拷贝这些原型创建新的对象


public interface IBullet {

    public IBullet clone();

    public void fire();
}
