package com.designPattern.behavioral.command;

/**
 * Created by hongjingjun on 16/2/16.
 */

//意图
//将一个请求封装为一个对象,从而使你可用不同的请求对客户进行参数化

public interface ICommand {

    public void execute();
}
