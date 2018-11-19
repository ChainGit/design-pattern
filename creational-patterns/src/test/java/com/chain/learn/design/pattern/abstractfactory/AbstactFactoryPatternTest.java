package com.chain.learn.design.pattern.abstractfactory;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 10:28 AM
 */

public class AbstactFactoryPatternTest {

    @Test
    public void test() {
        ComputerFactory computerFactory = null;
        Mouse mouse = null;
        KeyBoard keyBoard = null;

        computerFactory = new LenovoPcFactory();
        keyBoard = computerFactory.getKeyBoard();
        mouse = computerFactory.getMouse();

        mouse.move();
        keyBoard.press();

        computerFactory = new DellPcFactory();
        keyBoard = computerFactory.getKeyBoard();
        mouse = computerFactory.getMouse();

        mouse.move();
        keyBoard.press();
    }
}
