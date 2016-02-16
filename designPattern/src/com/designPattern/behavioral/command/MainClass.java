package com.designPattern.behavioral.command;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class MainClass {

    public static void main(String[] argv) {

        RemoteControl remoteControl = new RemoteControl();


        Light livingRoomLight = new Light("living room");
        Light kitchenLight = new Light("kitchen");
        Stereo stereo = new Stereo("living room");

        LightOnCommand livingRoomOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenOff = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomOn, livingRoomOff);
        remoteControl.setCommand(1, kitchenOn, kitchenOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);

        //模拟遥控器开和关
        remoteControl.onProcessAction(0);
        remoteControl.offProcessAction(0);

        remoteControl.onProcessAction(1);
        remoteControl.offProcessAction(1);

        remoteControl.onProcessAction(2);
        remoteControl.offProcessAction(2);

        remoteControl.onProcessAction(3);
    }
}
