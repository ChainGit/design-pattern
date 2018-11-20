package com.chain.learn.design.pattern.bridge;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/20 8:28 PM
 */

public class NewPainter extends AbstractPainter implements Painter {

    NewPainter(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        PrintUtils.println("new shape is ", getShape().desc());
    }
}
