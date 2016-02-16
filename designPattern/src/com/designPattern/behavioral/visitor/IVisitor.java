package com.designPattern.behavioral.visitor;

/**
 * Created by hongjingjun on 16/2/15.
 */

//意图
//表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提 下定义作用于这些元素的新操作

public interface IVisitor {

    public void visitConcreteElementA(ConcreteElementA elementA);
    public void visitConcreteElementB(ConcreteElementB elementB);
//    public void visitConcreteElementC();
}
