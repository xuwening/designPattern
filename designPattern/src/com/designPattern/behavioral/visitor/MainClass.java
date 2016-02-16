package com.designPattern.behavioral.visitor;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class MainClass {

    public static void main(String[] argv) {

        ObjectStruct objects = new ObjectStruct();

        objects.attach(new ConcreteElementA());
        objects.attach(new ConcreteElementB());
        objects.attach(new ConcreteElementA());

        ConcreteVisitor1 v1 = new ConcreteVisitor1();
        ConcreteVisitor2 v2 = new ConcreteVisitor2();

        objects.accept(v1);
//        objects.accept(v2);
    }
}
