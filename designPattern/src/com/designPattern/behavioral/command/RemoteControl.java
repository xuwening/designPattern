package com.designPattern.behavioral.command;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class RemoteControl {

    private ICommand[] onCommand;
    private ICommand[] offCommand;

    public RemoteControl() {

        onCommand = new ICommand[7];
        offCommand = new ICommand[7];

        NoCommand cmd = new NoCommand();
        for (int i=0; i<7; i++) {

            onCommand[i] = cmd;
            offCommand[i] = cmd;
        }
    }

    public void setCommand(int slot, ICommand onCmd, ICommand offCmd) {

        onCommand[slot] = onCmd;
        offCommand[slot] = offCmd;
    }

    public void onProcessAction(int slot) {

        onCommand[slot].execute();
    }

    public void offProcessAction(int slot) {

        offCommand[slot].execute();
    }
}




