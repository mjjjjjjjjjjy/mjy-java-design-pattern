package com.mjy.设计原则.依赖倒置;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 11:00 AM
 * @Modified By
 */
public class Driver implements IDriver{

    @Override
    public void drive(ICar car) {
        car.run();
    }
}
