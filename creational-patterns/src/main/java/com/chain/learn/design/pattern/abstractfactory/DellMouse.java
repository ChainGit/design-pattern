package com.chain.learn.design.pattern.abstractfactory;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 1:42 PM
 */

public class DellMouse implements Mouse {

    @Override
    public void move() {
        PrintUtils.println("dell mouse");
    }
}
