package com.mjy.设计原则.里氏替换原则;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 10:47 AM
 * @Modified By
 */
public class HandGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("手枪射击");
    }
}
