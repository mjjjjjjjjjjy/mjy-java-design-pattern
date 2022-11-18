package com.mjy.设计模式.创建型.单例模式;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 11:25 AM
 * @Modified By
 */
public class StaticInnerClassSingleton {
    private static class StaticInnerClass{
        static {
            System.out.println("初始化静态内部类");
        }
        private static StaticInnerClassSingleton instance = get();
        private static StaticInnerClassSingleton get(){
            System.out.println("初始化实例");
            return new StaticInnerClassSingleton();
        }

    }

    public static StaticInnerClassSingleton getInstance(){
        System.out.println("获取对象");
        return StaticInnerClass.instance;
    }

    public static void main(String[] args) {
        StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(instance);
    }

}
