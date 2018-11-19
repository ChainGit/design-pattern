package com.chain.learn.design.pattern.prototype;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 12:59 PM
 */

public interface Shape extends Cloneable {

    void draw();

    Shape cloneOne();
}
