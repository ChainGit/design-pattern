package com.chain.learn.design.pattern.factory2.simplefactory;

import com.chain.learn.design.pattern.factory2.工厂;

/**
 * @Author bangquan.qian
 * @Date 2019-01-19 17:24
 */

public class 计算机工厂 implements 工厂 {

    public static 计算机 生产(计算机图纸 图纸) {
        switch (图纸) {
            default:
                return null;
            case 服务器:
                return new 服务器();
            case 台式机:
                return new 台式机();
            case 笔记本:
                return new 笔记本();
        }
    }
}
