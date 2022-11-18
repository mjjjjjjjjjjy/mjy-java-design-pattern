package com.mjy.设计模式.创建型.单例模式;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 11:13 AM
 * @Modified By
 */
public class SingletonLazy {
    private static volatile SingletonLazy instance;

    public static  SingletonLazy getInstance(){
        if (instance == null){
            synchronized (SingletonLazy.class){
                // 线程还是不够安全，因为抢锁失败的第二个线程，也会进来再创建一次
                instance = new SingletonLazy();
            }
        }
        return instance;
    }
}
