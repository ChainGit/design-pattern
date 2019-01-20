package com.chain.learn.design.pattern.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/18 1:25 PM
 */

public final class PrintUtils {

    private PrintUtils() {
    }

    public static void println(Object arg) {
        System.out.println(arg);
    }

    public static void println(Object... args) {
        System.out.println(StringUtils.join(args));
    }

    public static void printJsonString(Object... args) {
        System.out.println(JSON.toJSONString(args));
    }

    public static void printPrettyJsonString(Object... args) {
        System.out.println(JSON.toJSONString(args, SerializerFeature.PrettyFormat));
    }
}
