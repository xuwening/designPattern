package com.designPattern.creational.Prototype;

import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/13.
 */
public class Plane {

    private IBullet bullet;
    private int bulletNumber;

    //生成一次子弹粒子
    protected ArrayList<IBullet> genBullets() {

        ArrayList<IBullet> bullets = new ArrayList<IBullet>();

        for (int i=0; i<bulletNumber; i++) {
            bullets.add(bullet.clone());
        }

        return bullets;
    }

    public void fire() {

        ArrayList<IBullet> bullets = this.genBullets();
        for (IBullet bullet : bullets) {
            bullet.fire();
        }
    }
}
