package com.chain.learn.design.pattern.factory;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 1:43 PM
 */

public class LenovoMouse implements Mouse {

    @Override
    public void move() {
        PrintUtils.println("lenovo mouse");
    }
}
