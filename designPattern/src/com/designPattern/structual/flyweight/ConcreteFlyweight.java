package com.designPattern.structual.flyweight;

/**
 * Created by hongjingjun on 16/2/15.
 */


public class ConcreteFlyweight implements Flyweight {

    private Object intrinsicState = null;

    public ConcreteFlyweight(Object state) {

        intrinsicState = state;
    }

    @Override
    public void operation(Object extrinsicState) {

    }
}
