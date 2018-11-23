package com.chain.learn.design.pattern.adaptor;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/20 12:40 PM
 */

public class Storm3pgMediaPlayerAdaptor extends AbstractStormMediaPlayer implements MediaPlayerAdaptor {

    @Override
    public void play(MediaTypeEnum type, String path) {
        if (isSupport(type)) {
            PrintUtils.println("play 3gp:", path);
            return;
        }

        processNotSupport(type, path);
    }

    @Override
    public boolean isSupport(MediaTypeEnum type) {
        return MediaTypeEnum._3GP.equals(type);
    }
}
