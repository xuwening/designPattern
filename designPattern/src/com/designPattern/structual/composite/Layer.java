package com.designPattern.structual.composite;

import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/14.
 */

public class Layer implements Graphic {

    private ArrayList<Graphic> subs = new ArrayList<Graphic>();

    @Override
    public void draw() {

        for (Graphic g: subs) {

            g.draw();
        }
    }

    @Override
    public void add(Graphic g) {

        subs.add(g);
    }

    @Override
    public void remove(Graphic g) {
        subs.remove(g);
    }

    @Override
    public ArrayList<Graphic> getChilds() {
        return subs;
    }
}
