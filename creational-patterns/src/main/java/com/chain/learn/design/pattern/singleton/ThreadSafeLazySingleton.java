package com.chain.learn.design.pattern.singleton;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 10:49 AM
 */

public class ThreadSafeLazySingleton extends AbstractSingletonAction {

    private static ThreadSafeLazySingleton instance;

    private ThreadSafeLazySingleton() {
    }

    public static ThreadSafeLazySingleton getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized (ThreadSafeLazySingleton.class) {
            if (instance != null) {
                return instance;
            }
            instance = new ThreadSafeLazySingleton();
        }

        return instance;
    }
}
