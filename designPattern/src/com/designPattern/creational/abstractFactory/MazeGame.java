package com.designPattern.creational.abstractFactory;

/**
 * Created by hongjingjun on 16/2/12.
 */
public class MazeGame {

    public static IMaze createMaze(IMazeFactory factory) {

        IMaze zmaze = factory.makeMaze();
        IRoom room1 = factory.makeRoom(1);
        IRoom room2 = factory.makeRoom(2);
        IDoor door = factory.makeDoor(room1, room2);

        zmaze.addRoom(room1);
        zmaze.addRoom(room2);

        room1.setSide(IRoom.EDirection.North, factory.makeWall());
        room1.setSide(IRoom.EDirection.East, door);
        room1.setSide(IRoom.EDirection.South, factory.makeWall());
        room1.setSide(IRoom.EDirection.West, factory.makeWall());

        room2.setSide(IRoom.EDirection.North, factory.makeWall());
        room2.setSide(IRoom.EDirection.East, factory.makeWall());
        room2.setSide(IRoom.EDirection.South, factory.makeWall());
        room2.setSide(IRoom.EDirection.West, door);

        return zmaze;
    }
}
