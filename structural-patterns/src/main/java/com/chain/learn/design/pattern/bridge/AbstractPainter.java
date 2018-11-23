package com.chain.learn.design.pattern.bridge;

/**
 * @Author bangquan.qian
 * @Date 2018/11/20 8:22 PM
 */

public abstract class AbstractPainter implements Painter {

    private Shape shape;

    AbstractPainter(Shape shape) {
        this.shape = shape;
    }

    Shape getShape() {
        return shape;
    }
}
