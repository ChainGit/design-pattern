package com.chain.learn.design.pattern.builder2;

/**
 * @Author bangquan.qian
 * @Date 2019-01-28 11:34
 */

public class 定制电脑建造者 {

    private 电脑 computer;

    public 定制电脑建造者(电脑 computer) {
        this.computer = computer;
    }

    public static 定制电脑建造者 新建建造者() {
        return new 定制电脑建造者(new 电脑());
    }

    public 定制电脑建造者 配置CPU(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public 定制电脑建造者 配置硬盘(String disk) {
        computer.setDisk(disk);
        return this;
    }

    public 定制电脑建造者 配置主板(String board) {
        computer.setBoard(board);
        return this;
    }

    public 电脑 建造() {
        return computer;
    }
}
