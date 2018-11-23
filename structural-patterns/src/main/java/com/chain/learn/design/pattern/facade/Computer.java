package com.chain.learn.design.pattern.facade;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author bangquan.qian
 * @Date 2018/11/22 11:58 AM
 */

public class Computer {

    private Map<DeviceEnum, Device> devices = new LinkedHashMap<>();

    private Computer() {
    }

    public void startup() {
        PrintUtils.println("computer starting..");
        for (Device device : devices.values()) {
            device.startup();
        }
        PrintUtils.println("computer started");
    }

    public void shutdown() {
        PrintUtils.println("computer shutdowning..");
        Collection<Device> values = devices.values();
        for (Device device : values) {
            device.shutdown();
        }
        PrintUtils.println("computer shutdowned");
    }

    public static Computer newComputer() {
        Computer computer = new Computer();
        computer.register(new CPU());
        computer.register(new Disk());
        computer.register(new Memory());
        return computer;
    }

    private void register(Device device) {
        if (device == null) {
            throw new RuntimeException("device is null");
        }

        DeviceEnum deviceEnum = DeviceEnum.getType(device.getType());
        if (!devices.containsKey(deviceEnum)) {
            devices.put(deviceEnum, device);
        }
    }
}
