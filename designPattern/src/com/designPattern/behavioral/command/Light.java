package com.designPattern.behavioral.command;

/**
 * Created by hongjingjun on 16/2/16.
 */

public class Light {

    private String location;
    public Light(String location) {

        this.location = location;
    }

    public void lightOn() {

        System.out.println(location + " light on");
    }

    public void lightOff() {

        System.out.println(location + " light off");
    }

    public String getLocation() {
        return location;
    }
}
