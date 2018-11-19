package com.chain.learn.design.pattern.factory.simplefactory;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 1:07 PM
 */

public class DefaultShape implements Shape {

    @Override
    public void draw() {
        System.out.println("shape");
    }
}
