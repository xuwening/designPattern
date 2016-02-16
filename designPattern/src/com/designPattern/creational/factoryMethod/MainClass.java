package com.designPattern.creational.factoryMethod;

/**
 * Created by hongjingjun on 16/2/13.
 */

class MyDocument implements IDocument {

    @Override
    public void open() {
        System.out.println("opened doc.");
    }

    @Override
    public void close() {

    }

    @Override
    public void save() {

    }
}

class TextDocument implements IDocument {

    @Override
    public void open() {

        System.out.println("opened text.");
    }

    @Override
    public void close() {

    }

    @Override
    public void save() {

    }
}

class MyApplication extends Application {

    @Override
    protected IDocument createDocument() {
        return new MyDocument();
    }
}

class TextApplication extends Application {

    @Override
    protected IDocument createDocument() {
        return new TextDocument();
    }
}

public class MainClass {

    public static void main(String[] argv) {

        IDocument doc = new MyApplication().newDocument();
        doc.open();
        doc.save();
        doc.close();

        IDocument txt = new TextApplication().newDocument();
        txt.open();
        txt.save();
        txt.close();
    }
}
