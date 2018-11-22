package com.chain.learn.design.pattern.facade;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/22 11:57 AM
 */

public class Memory implements Device {

    @Override
    public int getType() {
        return DeviceEnum.MEMORY.getType();
    }

    @Override
    public void startup() {
        PrintUtils.println("memory startup");
    }

    @Override
    public void shutdown() {
        PrintUtils.println("memory shutdown");
    }
}
