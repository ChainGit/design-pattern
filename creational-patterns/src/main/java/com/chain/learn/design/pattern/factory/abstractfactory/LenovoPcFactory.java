package com.chain.learn.design.pattern.factory.abstractfactory;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 1:44 PM
 */

public class LenovoPcFactory implements ComputerFactory {

    @Override
    public Mouse getMouse() {
        return new LenovoMouse();
    }

    @Override
    public KeyBoard getKeyBoard() {
        return new LenovoKeyBoard();
    }
}
