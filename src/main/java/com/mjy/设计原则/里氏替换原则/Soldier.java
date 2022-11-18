package com.mjy.设计原则.里氏替换原则;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 10:49 AM
 * @Modified By
 */
public class Soldier {
    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }
    public void shoot(){
        gun.shoot();
    }

    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.setGun(new HandGun());
        soldier.shoot();
    }

}
