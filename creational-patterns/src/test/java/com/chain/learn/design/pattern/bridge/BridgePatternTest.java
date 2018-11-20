package com.chain.learn.design.pattern.bridge;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2018/11/20 8:25 PM
 */

public class BridgePatternTest {

    @Test
    public void test() {
        Shape shape = null;
        Painter painter = null;

        shape = new Circle();
        painter = new SimplePainter(shape);
        painter.draw();

        shape = new Square();
        painter = new NewPainter(shape);
        painter.draw();
    }
}
