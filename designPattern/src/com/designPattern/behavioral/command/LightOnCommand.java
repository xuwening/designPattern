package com.designPattern.behavioral.command;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class LightOnCommand implements ICommand {

    private Light light = null;

    public LightOnCommand(Light light) {

        this.light = light;
    }

    @Override
    public void execute() {

        light.lightOn();
    }
}
