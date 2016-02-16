package com.designPattern.structual.adapter;

import com.sun.tools.javac.util.List;

import java.awt.*;
import java.util.*;

/**
 * Created by hongjingjun on 16/2/14.
 */

//组合方式实现适配器

public class MyStack implements IStack {

    private ArrayList<Object> list = new ArrayList<Object>();

    @Override
    public void push(Object object) {
        list.add(object);
    }

    @Override
    public Object pop() {
        return list.remove(list.size()-1);
    }

    @Override
    public int count() {
        return list.size();
    }
}
