package com.chain.learn.design.pattern.singleton;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 10:56 AM
 */

public class AbstractSingletonAction implements SingletonAction {

    @Override
    public void show() {
        PrintUtils.println(this.hashCode());
    }
}
