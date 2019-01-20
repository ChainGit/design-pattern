package com.chain.learn.design.pattern.factory2.factory;

/**
 * @Author bangquan.qian
 * @Date 2019-01-19 17:51
 */

public class 联想计算机工厂 implements 计算机工厂 {

    @Override
    public 计算机 生产(计算机图纸 图纸) {
        switch (图纸) {
            default:
                return null;
            case 服务器:
                return new 联想服务器();
            case 台式机:
                return new 联想台式机();
            case 笔记本:
                return new 联想笔记本();
        }
    }
}
