package com.mjy.设计模式.创建型.原型模式;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 12:03 PM
 * @Modified By
 */
public class Prototype {
    public static class Test implements Cloneable{
        private int a;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
        @Override
        public Test clone(){
            try {
                return (Test)super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.setA(1);
        System.out.println(test.getA());
        Test clone = test.clone();
        System.out.println(clone.getA());
    }
}
