package com.designPattern.behavioral.strategy;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class MainClass {

    public static void main(String[] argv) {

        Context ctx = new Context(new ConcreteStrategyA());
        ctx.strtegyMethod();
//
//        Context ctx = new Context(new ConcreteStrategyB());
//        ctx.strtegyMethod();
//
//        Context ctx = new Context(new ConcreteStrategyC());
//        ctx.strtegyMethod();

    }
}
