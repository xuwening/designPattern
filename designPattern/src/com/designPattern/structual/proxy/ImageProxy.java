package com.designPattern.structual.proxy;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class ImageProxy implements Graphic {

    private Image image = null;

    @Override
    public void draw() {

        if (image == null) {
            image = new Image();
        }

        image.draw();
    }

    @Override
    public Object store() {
        return null;
    }

    @Override
    public void load() {

    }
}
