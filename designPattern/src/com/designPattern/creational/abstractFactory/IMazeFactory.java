package com.designPattern.creational.abstractFactory;

/**
 * Created by hongjingjun on 16/2/12.
 */

//意图
//提供一个创建一系列相关或相互依赖对象的接口,而无需指定它们具体的类

public interface IMazeFactory {

    public IMaze makeMaze();
    public IWall makeWall();
    public IRoom makeRoom(int n);
    public IDoor makeDoor(IRoom room1, IRoom room2);
}
