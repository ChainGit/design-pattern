package com.chain.learn.design.pattern.factory2.abstractfactory;

/**
 * @Author bangquan.qian
 * @Date 2019-01-20 23:25
 */

public class 例子 {

    public static void main(String[] args) {

        抽象服饰工厂 阿迪工厂 = new 阿迪工厂();
        抽象服饰工厂 耐克工厂 = new 耐克工厂();

        衣服 阿迪衣 = 阿迪工厂.生产衣服();
        鞋子 阿迪鞋 = 阿迪工厂.生产鞋子();

        衣服 耐克衣 = 耐克工厂.生产衣服();
        鞋子 耐克鞋 = 耐克工厂.生产鞋子();

        顾客 顾客 = new 顾客();

        阿迪衣.描述();
        阿迪鞋.描述();

        耐克衣.描述();
        耐克鞋.描述();

        // ...
    }
}
