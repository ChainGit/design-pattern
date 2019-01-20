package com.chain.learn.design.pattern.factory2.abstractfactory;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-01-20 23:12
 */

public class 阿迪鞋 implements 鞋子 {

    @Override
    public void 描述() {
        PrintUtils.println("一件阿迪鞋");
    }
}
