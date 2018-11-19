package com.chain.learn.design.pattern.builder;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 3:58 PM
 */

public enum MenuEnum {

    MALE(0),
    FEMALE(1);

    private int type;

    MenuEnum(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static MenuEnum getType(int type) {
        for (MenuEnum menuEnum : values()) {
            if (menuEnum.type == type) {
                return menuEnum;
            }
        }

        return null;
    }

    public static MenuEnum getType(Integer type) {
        return type == null ? null : getType(type.intValue());
    }
}
