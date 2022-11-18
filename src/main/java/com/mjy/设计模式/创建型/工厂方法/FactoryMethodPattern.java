package com.mjy.设计模式.创建型.工厂方法;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/17 11:47 AM
 * @Modified By
 */
public class FactoryMethodPattern {
    interface Pan{
        void color();
    }
    static class RedPan implements Pan{

        @Override
        public void color() {
            System.out.println("红色笔");
        }
    }
    static class BluePan implements Pan{


        @Override
        public void color() {
            System.out.println("蓝色笔");
        }
    }

    static class PanFactory{
        public <T extends Pan> T getPan(Class<T> clazz){
            try {
                return (T) Class.forName(clazz.getName()).newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        PanFactory panFactory = new PanFactory();
        panFactory.getPan(BluePan.class).color();
        panFactory.getPan(RedPan.class).color();
    }
}
