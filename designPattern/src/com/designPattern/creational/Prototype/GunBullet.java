package com.designPattern.creational.Prototype;

/**
 * Created by hongjingjun on 16/2/13.
 */
public class GunBullet implements IBullet {

    @Override
    public IBullet clone() {

        //为代码简单,这里使用系统浅拷贝方法,正式应用时应使用深拷贝
        return this.clone();
    }

    @Override
    public void fire() {

    }
}
