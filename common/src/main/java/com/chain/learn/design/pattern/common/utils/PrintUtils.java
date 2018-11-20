package com.chain.learn.design.pattern.common.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 1:25 PM
 */

public final class PrintUtils {

    private PrintUtils() {
    }

    public static void println(Object... args) {
        System.out.println(StringUtils.join(args));
    }
}
