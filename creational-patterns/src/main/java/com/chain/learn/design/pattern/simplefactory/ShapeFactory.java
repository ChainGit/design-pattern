package com.chain.learn.design.pattern.simplefactory;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 12:58 PM
 */

public class ShapeFactory {

    public static Shape getShape(ShapeEnum type) {
        Shape shape = null;
        switch (type) {
            default:
                shape = new DefaultShape();
                break;
            case CIRCLE:
                shape = new CircleShape();
                break;
            case RECTANGLE:
                shape = new RectangleShape();
                break;
            case SQUARE:
                shape = new SquareShape();
                break;
        }
        return shape;
    }
}
