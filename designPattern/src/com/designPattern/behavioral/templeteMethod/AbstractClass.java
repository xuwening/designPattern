package com.designPattern.behavioral.templeteMethod;

/**
 * Created by hongjingjun on 16/2/15.
 */

//意图
//定 义 一 个 操 作 中 的 算 法 的 骨 架 , 而 将 一 些 步 骤 延 迟 到 子 类 中

abstract public class AbstractClass {

    public void templeteMethod() {

        //...

        primitiveOperation1();

        //....

        primitiveOperation2();

        //...
    }

    abstract public void primitiveOperation1();
    abstract public void primitiveOperation2();
}
