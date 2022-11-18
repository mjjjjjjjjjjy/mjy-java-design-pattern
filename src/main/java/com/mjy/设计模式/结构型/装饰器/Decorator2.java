package com.mjy.设计模式.结构型.装饰器;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 4:13 PM
 * @Modified By
 */
public class Decorator2 {
    static abstract class SchoolReport{
        abstract void report();
        abstract void sign(String name);
    }

    static abstract class ReportDecorator extends SchoolReport{
        private SchoolReport schoolReport;

        public ReportDecorator(SchoolReport schoolReport) {
            this.schoolReport = schoolReport;
        }

        @Override
        void report() {
            schoolReport.report();
        }

        @Override
        void sign(String name) {
            schoolReport.sign(name);
        }


    }

    static class HightScoreReport extends ReportDecorator{

        public HightScoreReport(SchoolReport schoolReport) {
            super(schoolReport);
        }

        @Override
        void report() {
            System.out.println("先汇报好成绩");
            super.report();
        }
    }

    static class OriginReport extends SchoolReport{

        @Override
        void report() {
            System.out.println("原始成绩单");
        }

        @Override
        void sign(String name) {
            System.out.println("签名+"+name);
        }
    }

    public static void main(String[] args) {
        HightScoreReport hightScoreReport = new HightScoreReport(new OriginReport());
        hightScoreReport.report();
        hightScoreReport.sign("老豆签名");
    }


}
