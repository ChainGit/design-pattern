package com.chain.learn.design.pattern.factory2.factory;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-01-19 17:29
 */

public class 戴尔台式机 implements 戴尔计算机 {

    @Override
    public void 描述() {
        PrintUtils.println("我是一台戴尔台式机");
    }
}
