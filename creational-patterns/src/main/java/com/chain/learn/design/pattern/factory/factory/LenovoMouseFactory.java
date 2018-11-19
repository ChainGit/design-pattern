package com.chain.learn.design.pattern.factory.factory;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 1:44 PM
 */

public class LenovoMouseFactory implements MouseFactory {

    @Override
    public Mouse getMouse() {
        return new LenovoMouse();
    }
}
