package com.designPattern.structual.decorator;

/**
 * Created by hongjingjun on 16/2/15.
 */

public class FileStream extends Stream {

    String filePath = null;
    public FileStream(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void handleBufferFull() {

    }
}
