package com.designPattern.behavioral.iterator;

/**
 * Created by hongjingjun on 16/2/15.
 */

//意图
//提供一种方法顺序访问一个聚合对象中各个元素 , 而又不需暴露该对象的内部表示

public interface Iterator {

    public void first();
    public void next();
    public boolean isDone();
    public Object currentItem();
}
