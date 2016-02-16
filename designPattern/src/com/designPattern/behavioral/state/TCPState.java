package com.designPattern.behavioral.state;

/**
 * Created by hongjingjun on 16/2/15.
 */

//意图
//允许一个对象在其内部状态改变时改变它的行为


public interface TCPState {

    public void open(TCPConnection connection);
    public void close(TCPConnection connection);
    public void acknowledge(TCPConnection connection);
}
