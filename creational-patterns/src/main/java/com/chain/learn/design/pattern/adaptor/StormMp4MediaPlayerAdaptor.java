package com.chain.learn.design.pattern.adaptor;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 7:21 PM
 */

public class StormMp4MediaPlayerAdaptor extends AbstractStormMediaPlayer implements MediaPlayerAdaptor {

    @Override
    public void play(MediaTypeEnum type, String path) {
        if (isSupport(type)) {
            PrintUtils.println("play mp4:", path);
            return;
        }

        PrintUtils.println("media not support");
    }

    @Override
    public boolean isSupport(MediaTypeEnum type) {
        return MediaTypeEnum.MP4.equals(type);
    }
}
