package com.chain.learn.design.pattern.decorator;

/**
 * @Author bangquan.qian
 * @Date 2018/11/22 10:57 AM
 */

public abstract class AbstractDecoratorLogger implements Logger {

    protected Logger logger;

    public AbstractDecoratorLogger(Logger logger) {
        this.logger = logger;
    }
}
