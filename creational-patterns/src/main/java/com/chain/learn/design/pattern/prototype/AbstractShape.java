package com.chain.learn.design.pattern.prototype;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 6:20 PM
 */

public abstract class AbstractShape implements Shape {

    @Override
    public Shape cloneOne() {
        try {
            PrintUtils.println("Shape clone");
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("clone object error");
        }
    }
}
