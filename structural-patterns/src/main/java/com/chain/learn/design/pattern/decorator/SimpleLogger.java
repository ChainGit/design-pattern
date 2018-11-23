package com.chain.learn.design.pattern.decorator;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/22 10:55 AM
 */

public class SimpleLogger implements Logger {

    @Override
    public void log(Object... objs) {
        PrintUtils.println(objs);
    }
}
