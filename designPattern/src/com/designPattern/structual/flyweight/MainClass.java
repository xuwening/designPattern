package com.designPattern.structual.flyweight;

/**
 * Created by hongjingjun on 16/2/15.
 */

public class MainClass {

    public static void main(String[] argv) {

        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight = factory.getFlyweight(new Character('A'));
        flyweight.operation("......");

        flyweight = factory.getFlyweight(new Character('B'));
        flyweight.operation("......");

        flyweight = factory.getFlyweight(new Character('A'));
        flyweight.operation("......");
    }
}
