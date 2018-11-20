package com.chain.learn.design.pattern.adaptor;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/20 1:25 PM
 */

public abstract class AbstractStormMediaPlayer implements MediaPlayer {

    @Override
    public boolean isSupport(int type) {
        return isSupport(MediaTypeEnum.getType(type));
    }

    @Override
    public void play(int type, String path) {
        this.play(MediaTypeEnum.getType(type), path);
    }

    protected void processNotSupport(MediaTypeEnum type, String path) {
        PrintUtils.println("media not support:", path);
    }
}
