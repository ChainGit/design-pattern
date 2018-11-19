package com.chain.learn.design.pattern.singleton;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 10:48 AM
 */

public class LazySingleton extends AbstractSingletonAction{

    private static LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }
}
