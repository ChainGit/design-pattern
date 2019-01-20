package com.chain.learn.design.pattern.factory2.simplefactory;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-01-19 17:29
 */

public class 台式机 implements 计算机 {

    @Override
    public void 描述() {
        PrintUtils.println("我是一台台式机");
    }
}
