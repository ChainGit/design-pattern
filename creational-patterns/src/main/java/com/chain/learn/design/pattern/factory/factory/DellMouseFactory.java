package com.chain.learn.design.pattern.factory.factory;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 1:42 PM
 */

public class DellMouseFactory implements MouseFactory {

    @Override
    public Mouse getMouse() {
        return new DellMouse();
    }
}
