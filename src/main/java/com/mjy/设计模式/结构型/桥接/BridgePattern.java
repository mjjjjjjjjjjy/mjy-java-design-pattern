package com.mjy.设计模式.结构型.桥接;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 3:20 PM
 * @Modified By
 */
public class BridgePattern {
    interface IProduct{
        void produce();
        void sell();
    }
    interface Corp{
        void setProduct(IProduct product);
        void makMoney();
    }

    public static class PibaoCompany implements Corp{
        private IProduct product;

        @Override
        public void setProduct(IProduct product) {
            this.product = product;
        }

        @Override
        public void makMoney() {
            product.produce();
            product.sell();
        }
    }

    public static class Ipod implements IProduct{

        @Override
        public void produce() {
            System.out.println("生产ipod");
        }

        @Override
        public void sell() {
            System.out.println("ipod卖钱");
        }
    }

    public static class Xiaomi implements IProduct{

        @Override
        public void produce() {
            System.out.println("生产小米手机");
        }

        @Override
        public void sell() {
            System.out.println("销售小米手机");
        }
    }

    public static void main(String[] args) {
        Corp pibaoCompany = new PibaoCompany();
        pibaoCompany.setProduct(new Ipod());
        pibaoCompany.makMoney();
        pibaoCompany.setProduct(new Xiaomi());
        pibaoCompany.makMoney();
    }


}
