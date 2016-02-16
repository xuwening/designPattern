package com.designPattern.structual.decorator;

/**
 * Created by hongjingjun on 16/2/15.
 */


public class MainClass {

    public static void main(String[] argv) {

        String filePath = "/xxx/xxx.txt";

        //
        Stream stream = new CompressingStream(new ASCII7Stream(new FileStream(filePath)));

    }
}
