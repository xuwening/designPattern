package com.designPattern.creational.abstractFactory;

/**
 * Created by hongjingjun on 16/2/12.
 */
public interface IRoom {

    enum EDirection {
        North, East, South, West
    }


    public void setSide(EDirection dir, IWall wall);
    public void setSide(EDirection dir, IDoor door);
}
