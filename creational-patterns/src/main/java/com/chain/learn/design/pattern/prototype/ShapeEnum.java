package com.chain.learn.design.pattern.prototype;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 1:04 PM
 */

public enum ShapeEnum {

    CIRCLE(0),
    RECTANGLE(1),
    SQUARE(2),
    ;

    private int type;

    ShapeEnum(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static ShapeEnum getType(int type) {
        for (ShapeEnum shapeEnum : values()) {
            if (shapeEnum.type == type) {
                return shapeEnum;
            }
        }

        return null;
    }

    public static ShapeEnum getType(Integer type) {
        return type == null ? null : getType(type.intValue());
    }
}
