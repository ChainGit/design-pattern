package com.chain.learn.design.pattern.factory.abstractfactory;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 10:13 AM
 */

public class DellKeyBoard implements KeyBoard {

    @Override
    public void press() {
        PrintUtils.println("dell keyboard");
    }
}
