package com.chain.learn.design.pattern.facade;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2018/11/22 11:56 AM
 */

public class CPU implements Device {

    @Override
    public int getType() {
        return DeviceEnum.CPU.getType();
    }

    @Override
    public void startup() {
        PrintUtils.println("cpu startup");
    }

    @Override
    public void shutdown() {
        PrintUtils.println("cpu shutdown");
    }
}
