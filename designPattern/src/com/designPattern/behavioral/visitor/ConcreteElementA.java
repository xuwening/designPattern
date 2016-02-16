package com.designPattern.behavioral.visitor;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class ConcreteElementA implements IElement {

    @Override
    public void accept(IVisitor visitor) {

        visitor.visitConcreteElementA(this);
    }
}
