package com.designPattern.behavioral.state;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class TCPClosed implements TCPState {

    @Override
    public void open(TCPConnection connection) {

        //closed->listen

        //....

        //ok
        connection.changeState(new TCPListen());

    }

    @Override
    public void close(TCPConnection connection) {

    }

    @Override
    public void acknowledge(TCPConnection connection) {

    }
}
