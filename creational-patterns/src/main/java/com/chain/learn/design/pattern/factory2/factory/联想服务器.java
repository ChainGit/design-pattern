package com.chain.learn.design.pattern.factory2.factory;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-01-19 17:29
 */

public class 联想服务器 implements 联想计算机 {

    @Override
    public void 描述() {
        PrintUtils.println("我是一台联想服务器");
    }
}
