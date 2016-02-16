package com.designPattern.behavioral.iterator;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class MainClass {

    public static void main(String[] argv) {


        MyList list = new MyList();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator iter = list.createIterator();

        for (iter.first(); !iter.isDone(); iter.next()) {

            System.out.println( iter.currentItem() );
        }
    }
}
