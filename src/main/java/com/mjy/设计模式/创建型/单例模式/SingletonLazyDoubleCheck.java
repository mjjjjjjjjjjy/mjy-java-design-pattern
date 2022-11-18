package com.mjy.设计模式.创建型.单例模式;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 11:13 AM
 * @Modified By
 */
public class SingletonLazyDoubleCheck {
    private static volatile SingletonLazyDoubleCheck instance;

    public static SingletonLazyDoubleCheck getInstance(){
        if (instance == null){
            synchronized (SingletonLazyDoubleCheck.class){
                if (instance == null){
                    // 双重判断，就算是竞争锁失败，等待的线程进来后，也不会再生成一次。
                    instance = new SingletonLazyDoubleCheck();
                }
            }
        }
        return instance;
    }
}
