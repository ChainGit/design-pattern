package com.chain.learn.design.pattern.builder2;

import com.chain.learn.design.pattern.common.utils.PrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-01-28 11:36
 */

public class 电脑 {

    private String cpu;
    private String disk;
    private String board;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public void 描述() {
        StringBuilder sb = new StringBuilder();
        sb.append("CPU: ").append(cpu).append("\n");
        sb.append("主板: ").append(board).append("\n");
        sb.append("硬盘: ").append(disk).append("\n");
        PrintUtils.println(sb);
    }
}
