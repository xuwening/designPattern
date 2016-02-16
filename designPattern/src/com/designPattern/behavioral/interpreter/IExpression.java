package com.designPattern.behavioral.interpreter;

/**
 * Created by hongjingjun on 16/2/16.
 */

//意图
//给定一个语言,定义它的文法的一种表示,并定义一个解释器,这个解释器使用该表示 来解释语言中的句子

public interface IExpression {

    public void interpret(Context context);
}
