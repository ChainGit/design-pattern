package com.chain.learn.design.pattern.adaptor;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 6:52 PM
 */

public enum MediaTypeEnum {

    MP4(0),
    AVI(1),
    _3GP(2),
    RMVB(3),
    ;

    private int type;

    MediaTypeEnum(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static MediaTypeEnum getType(int type) {
        for (MediaTypeEnum enu : values()) {
            if (enu.type == type) {
                return enu;
            }
        }

        return null;
    }

    public static MediaTypeEnum getType(Integer type) {
        return type == null ? null : getType(type.intValue());
    }
}
