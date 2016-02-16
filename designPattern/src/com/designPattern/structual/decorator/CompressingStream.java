package com.designPattern.structual.decorator;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by hongjingjun on 16/2/15.
 */

public class CompressingStream extends StreamDecorator {

    public CompressingStream(Stream stream) {
        super(stream);
    }

    private ArrayList<byte[]> compressStream(ArrayList<byte[]> arrayList) {

        //.....

        return arrayList;
    }

    @Override
    public void handleBufferFull() {

        //压缩数据
        arrayList = compressStream(arrayList);

        //其他处理
        super.handleBufferFull();
    }
}
