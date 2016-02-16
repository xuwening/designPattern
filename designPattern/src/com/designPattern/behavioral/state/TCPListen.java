package com.designPattern.behavioral.state;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class TCPListen implements TCPState {
    @Override
    public void open(TCPConnection connection) {

    }

    @Override
    public void close(TCPConnection connection) {

    }

    @Override
    public void acknowledge(TCPConnection connection) {

        //listen->establisted

        //....

        //ok
        connection.changeState(new TCPEstablished());
    }
}
