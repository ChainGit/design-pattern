package com.chain.learn.design.pattern.factory;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 1:44 PM
 */

public class FactoryTest {

    @Test
    public void test() {
        MouseFactory factory = null;
        Mouse mouse = null;

        factory = new DellMouseFactory();
        mouse = factory.getMouse();
        mouse.move();

        factory = new LenovoMouseFactory();
        mouse = factory.getMouse();
        mouse.move();
    }
}
