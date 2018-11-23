package com.chain.learn.design.pattern.decorator;

import com.alibaba.fastjson.JSON;

/**
 * @Author bangquan.qian
 * @Date 2018/11/22 10:59 AM
 */

public class JsonDecoratorLogger extends AbstractDecoratorLogger {

    public JsonDecoratorLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(Object... objs) {
        Object obj = JSON.toJSONString(objs);
        logger.log(obj);
    }
}
