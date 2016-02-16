package com.designPattern.structual.adapter;

/**
 * Created by hongjingjun on 16/2/14.
 */


public class MainClass {

    public static void main(String[] argv) {

        IStack stack = new MyStack();
//        IStack stack = new InheritStack();

        stack.push("aaa");
        stack.push("bbb");
        stack.push("ccc");

        while (stack.count() != 0) {
            System.out.println("pop :" + stack.pop());
        }
    }
}
