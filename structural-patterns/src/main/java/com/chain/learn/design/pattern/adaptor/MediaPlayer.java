package com.chain.learn.design.pattern.adaptor;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 6:51 PM
 */

public interface MediaPlayer {

    void play(int type, String path);

    void play(MediaTypeEnum type, String path);

    boolean isSupport(MediaTypeEnum type);

    boolean isSupport(int type);
}
