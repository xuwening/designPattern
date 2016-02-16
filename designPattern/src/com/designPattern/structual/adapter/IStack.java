package com.designPattern.structual.adapter;

/**
 * Created by hongjingjun on 16/2/14.
 */


//将 List 接口适配为 stack 接口

public interface IStack {

    public void push(Object object);
    public Object pop();

    public int count();
}
