package com.chain.learn.design.pattern.facade;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/22 11:58 AM
 */

public class Disk implements Device {

    @Override
    public int getType() {
        return DeviceEnum.DISK.getType();
    }

    @Override
    public void startup() {
        PrintUtils.println("disk startup");
    }

    @Override
    public void shutdown() {
        PrintUtils.println("disk shutdown");
    }
}
