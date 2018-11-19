package com.chain.learn.design.pattern.prototype;

import com.chain.learn.design.pattern.common.utils.PrintUtils;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 6:30 PM
 */

public class PrototypePatternTest {

    @Test
    public void test() {
        Shape shape = null;

        shape = ShapeFactory.getShape(ShapeEnum.CIRCLE);
        PrintUtils.println(shape.hashCode());
        shape.draw();

        shape = ShapeFactory.getShape(ShapeEnum.RECTANGLE);
        PrintUtils.println(shape.hashCode());
        shape.draw();

        shape = ShapeFactory.getShape(ShapeEnum.SQUARE);
        PrintUtils.println(shape.hashCode());
        shape.draw();

        shape = ShapeFactory.getShape(ShapeEnum.CIRCLE);
        PrintUtils.println(shape.hashCode());
        shape.draw();

        shape = ShapeFactory.getShape(ShapeEnum.RECTANGLE);
        PrintUtils.println(shape.hashCode());
        shape.draw();

        shape = ShapeFactory.getShape(ShapeEnum.SQUARE);
        PrintUtils.println(shape.hashCode());
        shape.draw();
    }

}
