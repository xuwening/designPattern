package com.designPattern.behavioral.state;

/**
 * Created by hongjingjun on 16/2/15.
 */


public class TCPConnection {

    private TCPState state = new TCPClosed();

    public void changeState(TCPState state) {

        this.state = state;
    }

    public void open() {
        state.open(this);
        System.out.println(state);
    }
    public void close() {
        state.close(this);
        System.out.println(state);
    }
    public void acknowledge() {
        state.acknowledge(this);
        System.out.println(state);
    }

}
