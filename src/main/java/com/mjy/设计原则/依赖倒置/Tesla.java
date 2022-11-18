package com.mjy.设计原则.依赖倒置;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 11:01 AM
 * @Modified By
 */
public class Tesla implements ICar{
    @Override
    public void run() {
        System.out.println("开特斯拉");
    }
}
