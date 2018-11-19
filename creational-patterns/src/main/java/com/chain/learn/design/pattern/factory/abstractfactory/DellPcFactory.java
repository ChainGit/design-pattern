package com.chain.learn.design.pattern.factory.abstractfactory;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 1:42 PM
 */

public class DellPcFactory implements ComputerFactory {

    @Override
    public Mouse getMouse() {
        return new DellMouse();
    }

    @Override
    public KeyBoard getKeyBoard() {
        return new DellKeyBoard();
    }
}
