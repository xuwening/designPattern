package com.designPattern.structual.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hongjingjun on 16/2/15.
 */

public class FlyweightFactory {

    private Map<Object, Flyweight> flyweights = new HashMap<Object, Flyweight>();

    public Flyweight getFlyweight(Object state) {

        Flyweight flyweight = flyweights.get(state);
        if (flyweight != null) {
            return flyweight;
        }

        flyweight = new ConcreteFlyweight(state);
        flyweights.put(state, flyweight);

        return flyweight;
    }

}
