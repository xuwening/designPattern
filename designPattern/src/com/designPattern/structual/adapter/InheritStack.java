package com.designPattern.structual.adapter;

import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/14.
 */

//意图
//将一个类的接口转换成客户希望的另外一个接口

//继承方式实现适配器, 组合优于继承

public class InheritStack extends ArrayList<Object> implements IStack {

    @Override
    public void push(Object object) {

        this.add(object);
    }

    @Override
    public Object pop() {
        return this.remove(this.size()-1);
    }

    @Override
    public int count() {
        return this.size();
    }
}
