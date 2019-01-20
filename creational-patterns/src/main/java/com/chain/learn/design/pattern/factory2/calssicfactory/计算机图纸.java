package com.chain.learn.design.pattern.factory2.calssicfactory;

/**
 * @Author bangquan.qian
 * @Date 2019-01-19 17:25
 */

public enum 计算机图纸 {

    台式机(0),
    服务器(1),
    笔记本(2),
    ;

    private int 类型;

    计算机图纸(int 类型) {
        this.类型 = 类型;
    }

    public int 判断类型() {
        return 类型;
    }

    public static 计算机图纸 判断类型(Integer 类型) {
        if (类型 == null) {
            return null;
        }

        int 类型整型 = 类型;
        for (计算机图纸 图纸 : values()) {
            if (图纸.类型 == 类型整型) {
                return 图纸;
            }
        }

        return null;
    }
}
