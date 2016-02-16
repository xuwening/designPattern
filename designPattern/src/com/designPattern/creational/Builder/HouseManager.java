package com.designPattern.creational.Builder;

/**
 * Created by hongjingjun on 16/2/14.
 */
public class HouseManager {

    public static IHouse createHouse(IHouseBuilder builder) {

        builder.buildCelling();
        builder.buildDoor();
        builder.buildFLoor();
        builder.buildRoom();

        builder.buildWall();
        builder.buildWall();
        builder.buildWall();
        builder.buildWall();

        builder.buildWindow();
        builder.buildWindow();

        return builder.getHouse();
    }
}
