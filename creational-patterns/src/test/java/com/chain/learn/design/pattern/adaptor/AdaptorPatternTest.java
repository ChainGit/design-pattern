package com.chain.learn.design.pattern.adaptor;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2018/11/20 1:14 PM
 */

public class AdaptorPatternTest {

    @Test
    public void test() {
        MediaPlayer player = new StormMediaPlayer();

        player.play(MediaTypeEnum.AVI, "test.avi");

        player.play(MediaTypeEnum._3GP, "test.3pg");

        player.play(MediaTypeEnum.MP4, "test.mp4");

        player.play(MediaTypeEnum.RMVB, "test.rmvb");
    }

}
