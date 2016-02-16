package com.designPattern.behavioral.visitor;

/**
 * Created by hongjingjun on 16/2/15.
 */
public interface IElement {

    public void accept(IVisitor visitor);
}
