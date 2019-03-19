package com.chain.learn.design.pattern.builder2;

/**
 * @Author bangquan.qian
 * @Date 2019-01-28 11:46
 */

public class 例子 {

    public static void main(String[] args) {

        电脑 电脑1 = 定制电脑建造者.新建建造者()
                .配置主板("华硕M11-E")
                .配置CPU("酷睿i9 9900K")
                .配置硬盘("三星970Pro")
                .建造();

        电脑1.描述();

        电脑 电脑2 = 定制电脑建造者.新建建造者()
                .配置主板("华硕M10-E")
                .配置CPU("酷睿i7 8700K")
                .配置硬盘("三星970Pro")
                .建造();

        电脑2.描述();
    }
}
