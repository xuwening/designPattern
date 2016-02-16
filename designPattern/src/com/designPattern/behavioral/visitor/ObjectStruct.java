package com.designPattern.behavioral.visitor;

import com.sun.tools.javac.code.Attribute;

import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class ObjectStruct {

    private ArrayList<IElement> elements = new ArrayList<IElement>();

    public void attach(IElement element) {
        elements.add(element);
    }

    public void detach(IElement element) {
        elements.remove(element);
    }

    public void accept(IVisitor visitor) {

        for (IElement element : elements) {
            element.accept(visitor);
        }
    }
}
