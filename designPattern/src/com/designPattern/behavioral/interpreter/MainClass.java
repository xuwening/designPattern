package com.designPattern.behavioral.interpreter;

import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class MainClass {

    public static void main(String[] argc) {

        Context context = new Context();
        context.setSum(10);

        ArrayList<IExpression> expressions = new ArrayList<IExpression>();
        expressions.add(new PlusExpression());
        expressions.add(new PlusExpression());
        expressions.add(new PlusExpression());

        expressions.add(new MinusExpression());
        expressions.add(new MinusExpression());

        for (IExpression expression : expressions) {

            expression.interpret(context);
        }

        System.out.println(context.getSum());
    }
}
