package com.chain.learn.design.pattern.singleton;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 11:02 AM
 */

public enum EnumSingleton {

    INSTANCE;

    EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public void show() {
        PrintUtils.println(this.hashCode());
    }
}
