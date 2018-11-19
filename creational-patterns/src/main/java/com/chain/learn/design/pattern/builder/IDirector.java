package com.chain.learn.design.pattern.builder;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 3:56 PM
 */

public interface IDirector<T> {

    T direct(int type);

}
