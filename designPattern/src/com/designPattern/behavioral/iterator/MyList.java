package com.designPattern.behavioral.iterator;

import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class MyList extends ArrayList<Object> {

    public Iterator createIterator() {

        return new ListIterator(this);
    }
}
