package com.mjy.设计模式.结构型.装饰器;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 3:45 PM
 * @Modified By
 */
public class Decorator {
    interface Food{
        String content();
        double price();
    }
    interface Hamburger extends Food{

    }
    static abstract class HamburgerDecorator implements Hamburger{

        private Hamburger hamburger;

        public void setHamburger(Hamburger hamburger) {
            this.hamburger = hamburger;
        }
    }

    static class BaseHamburger implements Hamburger{

        @Override
        public String content() {
            return "一个汉堡包";
        }

        @Override
        public double price() {
            return 1;
        }
    }

    static class BoCaiHamburger extends HamburgerDecorator{

        @Override
        public String content() {
            return super.hamburger.content()+"加生菜";
        }

        @Override
        public double price() {
            return super.hamburger.price()+3;
        }
    }

    static class NiurouHamburger extends HamburgerDecorator{

        @Override
        public String content() {
            return super.hamburger.content()+"加牛肉";
        }

        @Override
        public double price() {
            return super.hamburger.price()+10;
        }
    }

    public static void main(String[] args) {
        BaseHamburger baseHamburger = new BaseHamburger();
        BoCaiHamburger boCaiHamburger = new BoCaiHamburger();
        boCaiHamburger.setHamburger(baseHamburger);
        NiurouHamburger niurouHamburger = new NiurouHamburger();
        niurouHamburger.setHamburger(boCaiHamburger);
        System.out.println(niurouHamburger.content()+",价格="+niurouHamburger.price());
    }

}
