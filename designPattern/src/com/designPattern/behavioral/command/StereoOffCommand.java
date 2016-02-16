package com.designPattern.behavioral.command;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class StereoOffCommand implements ICommand {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {

        this.stereo = stereo;
    }

    @Override
    public void execute() {

        stereo.off();
    }
}
