package com.chain.learn.design.pattern.adaptor;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 6:56 PM
 */

public class StormMediaPlayer extends AbstractStormMediaPlayer implements MediaPlayer {

    private Map<MediaTypeEnum, MediaPlayerAdaptor> mediaPlayerAdaptorMap = new ConcurrentHashMap<>();

    public StormMediaPlayer() {
        mediaPlayerAdaptorMap.put(MediaTypeEnum._3GP, new Storm3pgMediaPlayerAdaptor());
        mediaPlayerAdaptorMap.put(MediaTypeEnum.MP4, new StormMp4MediaPlayerAdaptor());
    }

    @Override
    public void play(MediaTypeEnum type, String path) {
        if (type == null) {
            throw new RuntimeException("media type is null");
        }

        MediaPlayerAdaptor mediaPlayerAdaptor = mediaPlayerAdaptorMap.get(type);
        if (mediaPlayerAdaptor != null && mediaPlayerAdaptor.isSupport(type)) {
            mediaPlayerAdaptor.play(type, path);
            return;
        }

        if (isSupport(type)) {
            PrintUtils.println("play avi:", path);
            return;
        }

        processNotSupport(type, path);
    }

    @Override
    public boolean isSupport(MediaTypeEnum type) {
        return MediaTypeEnum.AVI.equals(type);
    }
}
