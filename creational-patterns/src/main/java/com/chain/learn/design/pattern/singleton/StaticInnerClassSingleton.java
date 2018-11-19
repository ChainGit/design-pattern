package com.chain.learn.design.pattern.singleton;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 11:00 AM
 */

public class StaticInnerClassSingleton extends AbstractSingletonAction {

    private static class InstanceHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
