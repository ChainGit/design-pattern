package com.chain.learn.design.pattern.factory2.simplefactory;

/**
 * @Author bangquan.qian
 * @Date 2019-01-19 17:28
 */

public class 例子 {

    public static void main(String[] args) {

        计算机 服务器 = 计算机工厂.生产(计算机图纸.服务器);
        服务器.描述();

        计算机 台式机 = 计算机工厂.生产(计算机图纸.台式机);
        台式机.描述();

        计算机 笔记本 = 计算机工厂.生产(计算机图纸.笔记本);
        笔记本.描述();


    }
}
