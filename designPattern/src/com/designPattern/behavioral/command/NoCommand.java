package com.designPattern.behavioral.command;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class NoCommand implements ICommand {

    @Override
    public void execute() {

        System.out.println("No insert command.");
    }
}
