package com.chain.learn.design.pattern.abstractfactory;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 10:12 AM
 */

public class LenovoKeyBoard implements KeyBoard {

    @Override
    public void press() {
        PrintUtils.println("lenovo keyboard");
    }
}
