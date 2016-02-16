package com.designPattern.creational.Builder;

/**
 * Created by hongjingjun on 16/2/13.
 */

class Door implements IDoor {

}

class Wall implements IWall {

}

class Room implements IRoom {

}


class RomainHouse implements IHouse {


}


class RomainHouseBuilder implements IHouseBuilder {

    @Override
    public void buildWindow() {

    }

    @Override
    public void buildWall() {

    }

    @Override
    public void buildRoom() {

    }

    @Override
    public void buildDoor() {

    }

    @Override
    public void buildFLoor() {

    }

    @Override
    public void buildCelling() {

    }

    @Override
    public IHouse getHouse() {
        return new RomainHouse();
    }
}


public class MainClass {

    public static void main(String[] argv) {

        IHouse house = HouseManager.createHouse(new RomainHouseBuilder());

        //使用不同的builder 创建不同的 house,创建流程不变
//        IHouse house = HouseManager.createHouse(new OtherHouseBuilder());
    }
}
