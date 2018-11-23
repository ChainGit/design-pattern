package com.chain.learn.design.pattern.facade;

/**
 * @Author bangquan.qian
 * @Date 2018/11/22 12:00 PM
 */

public enum DeviceEnum {

    CPU(0),
    DISK(1),
    MEMORY(2),
    ;

    private int type;

    DeviceEnum(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static DeviceEnum getType(int type) {
        for (DeviceEnum enu : values()) {
            if (enu.type == type) {
                return enu;
            }
        }

        return null;
    }

    public static DeviceEnum getType(Integer type) {
        return type == null ? null : getType(type.intValue());
    }
}
