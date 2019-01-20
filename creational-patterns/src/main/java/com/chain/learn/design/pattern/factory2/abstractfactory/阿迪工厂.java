package com.chain.learn.design.pattern.factory2.abstractfactory;

/**
 * @Author bangquan.qian
 * @Date 2019-01-20 23:17
 */

public class 阿迪工厂 extends 抽象服饰工厂 {

    @Override
    public 衣服 生产衣服() {
        return new 阿迪衣();
    }

    @Override
    public 鞋子 生产鞋子() {
        return new 阿迪鞋();
    }
}
