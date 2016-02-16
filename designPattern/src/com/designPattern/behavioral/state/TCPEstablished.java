package com.designPattern.behavioral.state;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class TCPEstablished implements TCPState {

    @Override
    public void open(TCPConnection connection) {

    }

    @Override
    public void close(TCPConnection connection) {

        //establisted->closed

        //....

        //ok
        connection.changeState(new TCPClosed());
    }

    @Override
    public void acknowledge(TCPConnection connection) {

    }
}
