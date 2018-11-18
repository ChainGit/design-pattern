package com.chain.learn.design.pattern.simplefactory;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 1:01 PM
 */

public class SimpleFactoryPatternTest {

    @Test
    public void test() {
        Shape shape = null;

        shape = ShapeFactory.getShape(ShapeEnum.CIRCLE);
        shape.draw();

        shape = ShapeFactory.getShape(ShapeEnum.RECTANGLE);
        shape.draw();

        shape = ShapeFactory.getShape(ShapeEnum.SQUARE);
        shape.draw();
    }
}
