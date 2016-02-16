package com.designPattern.behavioral.state;

/**
 * Created by hongjingjun on 16/2/15.
 */

public class MainClass {

    public static void main(String[] argv) {

        TCPConnection connection = new TCPConnection();
        connection.open(); //listen
        connection.acknowledge(); //established
        connection.close(); //closed

    }
}
