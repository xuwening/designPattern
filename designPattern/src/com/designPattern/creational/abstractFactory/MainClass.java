package com.designPattern.creational.abstractFactory;

/**
 * Created by hongjingjun on 16/2/13.
 */

class Door implements IDoor {

}

class Wall implements IWall {

}

class Room implements IRoom {

    private int n;

    public Room(int n) {
        this.n = n;
    }

    @Override
    public void setSide(EDirection dir, IWall wall) {

    }

    @Override
    public void setSide(EDirection dir, IDoor door) {

    }
}

class Maze implements IMaze {

    @Override
    public void addRoom(IRoom room) {

    }

    @Override
    public void run() {

        System.out.println("game start running.");
    }
}

class MazeFactory implements IMazeFactory {

    @Override
    public IMaze makeMaze() {
        return new Maze();
    }

    @Override
    public IWall makeWall() {
        return new Wall();
    }

    @Override
    public IRoom makeRoom(int n) {
        return new Room(n);
    }

    @Override
    public IDoor makeDoor(IRoom room1, IRoom room2) {
        return new Door();
    }
}

class BombedMazeFactory implements IMazeFactory {
    @Override
    public IMaze makeMaze() {
        return new Maze();
    }

    @Override
    public IWall makeWall() {
        return new Wall();
    }

    @Override
    public IRoom makeRoom(int n) {
        return new Room(n);
    }

    @Override
    public IDoor makeDoor(IRoom room1, IRoom room2) {
        return new Door();
    }
}

public class MainClass {

    public static void main(String[] argv) {

//        IMaze amaze = MazeGame.createMaze(new MazeFactory());
//        amaze.run();

        IMaze amaze = MazeGame.createMaze(new BombedMazeFactory());
        amaze.run();;
    }
}
