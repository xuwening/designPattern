package com.designPattern.structual.composite;

/**
 * Created by hongjingjun on 16/2/14.
 */

public class MainClass {

    public static void main(String[] argv) {

        Label label = new Label();
        Button btn1 = new Button();
        Button btn2 = new Button();

        Layer layer = new Layer();
        layer.add(label);
        layer.add(btn1);
        layer.add(btn2);

        layer.draw();
    }
}
