package com.chain.learn.design.pattern.facade;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2018/11/22 12:15 PM
 */

public class FacadePatternTest {

    @Test
    public void test() {
        Computer computer = Computer.newComputer();

        computer.startup();
        computer.shutdown();
    }
}
