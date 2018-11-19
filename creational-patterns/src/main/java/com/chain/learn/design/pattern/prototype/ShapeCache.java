package com.chain.learn.design.pattern.prototype;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 4:57 PM
 */

public class ShapeCache {

    private static class InnerInstance {
        private static final ShapeCache INSTANCE = new ShapeCache();
    }

    private ShapeCache() {
    }

    private Map<ShapeEnum, Shape> cache = new ConcurrentHashMap<>();

    public void setCache(ShapeEnum shapeEnum, Shape shape) {
        PrintUtils.println("ShapeCache setCache");
        cache.put(shapeEnum, shape);
    }

    public void setCache(int type, Shape shape) {
        setCache(ShapeEnum.getType(type), shape);
    }

    public Shape getCache(ShapeEnum shapeEnum) {
        PrintUtils.println("ShapeCache getCache");
        return cache.get(shapeEnum);
    }

    public Shape getCache(int type) {
        return getCache(ShapeEnum.getType(type));
    }

    public static ShapeCache getInstance() {
        return InnerInstance.INSTANCE;
    }
}
