package com.designPattern.structual.decorator;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/15.
 */


abstract public class Stream {

    ArrayList<byte[]> arrayList = new ArrayList<byte[]>();

    public void putInt(int n) {

        String string = String.valueOf(n);
        arrayList.add(string.getBytes());
    }

    public void putString(String string) {

        arrayList.add(string.getBytes());
    }

    abstract public void handleBufferFull();
}
