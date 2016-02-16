package com.designPattern.creational.Singleton;

/**
 * Created by hongjingjun on 16/2/13.
 */

//意图
//保证一个类仅有一个实例,并提供一个访问它的全局访问点


public class Singleton {

    //保证对象的唯一性
    private Singleton() {

    }

    //方式1
    private static final Singleton s_instance = new Singleton();

    //方式2:存在线程安全问题,可加锁解决
    private static Singleton _instance;
    public Singleton sharedInstance() {

        if (_instance == null) {
            _instance = new Singleton();
        }

        return _instance;
    }

}
