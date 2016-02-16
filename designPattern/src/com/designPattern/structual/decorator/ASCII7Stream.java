package com.designPattern.structual.decorator;

/**
 * Created by hongjingjun on 16/2/15.
 */

public class ASCII7Stream extends StreamDecorator {

    public ASCII7Stream(Stream stream) {
        super(stream);
    }

    @Override
    public void handleBufferFull() {

        //custom process...

        super.handleBufferFull();
    }
}
