package com.designPattern.behavioral.command;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class StereoOnWithCDCommand implements ICommand {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {

        this.stereo = stereo;
    }

    @Override
    public void execute() {

        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
