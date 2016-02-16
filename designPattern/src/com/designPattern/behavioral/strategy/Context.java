package com.designPattern.behavioral.strategy;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class Context {

    private IStrategy strategy = null;

    public Context(IStrategy strategy) {

        this.strategy = strategy;
    }


//    char type = 'A';
//    switch (type) {
//
//        case 'A':
//            break;
//        case 'B':
//            break;
//        case 'C':
//            break;
//    }

    public void strtegyMethod() {

        strategy.strtegyMethod();
    }

}
