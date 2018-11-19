package com.chain.learn.design.pattern.prototype;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 12:58 PM
 */

public class ShapeFactory {

    public static Shape getShape(ShapeEnum type) {
        Shape shape = null;

        shape = ShapeCache.getInstance().getCache(type);
        if (shape != null) {
            return shape.cloneOne();
        }

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

        ShapeCache.getInstance().setCache(type, shape);

        return shape;
    }

}
