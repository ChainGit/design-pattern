package com.chain.learn.design.pattern.factory2.abstractfactory;

/**
 * @Author bangquan.qian
 * @Date 2019-01-20 23:12
 */

public abstract class 抽象服饰工厂 implements 衣服工厂, 鞋子工厂 {

    @Override
    public abstract 衣服 生产衣服();

    @Override
    public abstract 鞋子 生产鞋子();
}
