package com.chain.learn.design.pattern.singleton;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 10:47 AM
 */

public class HungrySingleton extends AbstractSingletonAction {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
