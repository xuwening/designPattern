package com.designPattern.structual.decorator;

/**
 * Created by hongjingjun on 16/2/15.
 */

//意图
//动态地给一个对象添加一些额外的职责

abstract public class StreamDecorator extends Stream {

    private Stream stream;
    private StreamDecorator(){

    }

    public StreamDecorator(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void handleBufferFull() {
        stream.handleBufferFull();
    }
}
