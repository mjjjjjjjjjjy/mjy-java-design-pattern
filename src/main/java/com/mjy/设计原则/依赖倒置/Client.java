package com.mjy.设计原则.依赖倒置;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 11:02 AM
 * @Modified By
 */
public class Client {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.drive(new Benz());
        driver.drive(new Tesla());
    }
}
