package com.designPattern.creational.factoryMethod;

/**
 * Created by hongjingjun on 16/2/13.
 */

//意图
//定义一个用于创建对象的接口,让子类决定实例化哪一个类


abstract public class Application {

    abstract protected IDocument createDocument();

    public IDocument newDocument() {

        IDocument doc = this.createDocument();
        return doc;
    }

    public void openDocument() {

    }
}
