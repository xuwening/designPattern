package com.designPattern.creational.Builder;

/**
 * Created by hongjingjun on 16/2/14.
 */

//意图
//将一个复杂对象的构建与它的表示分离,使得同样的构建过程可以创建不同的表示

public interface IHouseBuilder {

    public void buildWindow();
    public void buildWall();
    public void buildRoom();
    public void buildDoor();
    public void buildFLoor();
    public void buildCelling();

    //返回 build 结果
    public IHouse getHouse();
}
