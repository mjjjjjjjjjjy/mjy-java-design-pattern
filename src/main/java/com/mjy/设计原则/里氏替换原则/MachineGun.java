package com.mjy.设计原则.里氏替换原则;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 10:49 AM
 * @Modified By
 */
public class MachineGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("机枪射击");
    }
}
