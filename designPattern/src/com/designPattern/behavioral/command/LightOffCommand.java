package com.designPattern.behavioral.command;

/**
 * Created by hongjingjun on 16/2/16.
 */


public class LightOffCommand implements ICommand {

    private Light light;

    public LightOffCommand(Light light) {

        this.light = light;
    }

    @Override
    public void execute() {

        light.lightOff();
    }
}
