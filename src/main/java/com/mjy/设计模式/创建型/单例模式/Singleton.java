package com.mjy.设计模式.创建型.单例模式;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 11:13 AM
 * @Modified By
 */
public class Singleton {
    private static volatile Singleton instance;

    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
