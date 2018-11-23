package com.chain.learn.design.pattern.bridge;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/20 8:22 PM
 */

public class SimplePainter extends AbstractPainter implements Painter {

    public SimplePainter(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        PrintUtils.println("simple shape is ", getShape().desc());
    }
}
