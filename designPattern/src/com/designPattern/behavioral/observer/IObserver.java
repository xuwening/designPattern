package com.designPattern.behavioral.observer;

/**
 * Created by hongjingjun on 16/2/15.
 */

//意图
//定义对象间的一种一对多的依赖关系 ,当一个对象的状态发生改变时 , 所有依赖于它的对象 都得到通知并被自动更新

public interface IObserver {

    public void update(Subject subject);
}
