package com.designPattern.behavioral.command;

/**
 * Created by hongjingjun on 16/2/16.
 */
public class Stereo {

    private int volume = 0;
    private String location;

    public Stereo(String location) {

        this.location = location;
    }

    public void on() {

        System.out.println(location + "  on");
    }

    public void off() {

        System.out.println(location + "  off");
    }

    public void setCD() {

        System.out.println(location + "  play cd");
    }

    public void setVolume(int volume) {

        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
