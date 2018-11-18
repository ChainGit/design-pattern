package com.chain.learn.design.pattern.simplefactory;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 1:00 PM
 */

public class RectangleShape implements Shape {

    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}
