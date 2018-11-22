package com.chain.learn.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2018/11/21 4:16 PM
 */

public class FileNode {

    private String name;
    private List<FileNode> fileNodeList = new ArrayList<>();

    public FileNode(String name) {
        this.name = name;
    }

    public FileNode() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNode(FileNode fileNode) {
        if (fileNode == null) {
            throw new RuntimeException("file node is null");
        }
        fileNodeList.add(fileNode);
    }

    public void setFileNodeList(List<FileNode> fileNodeList) {
        this.fileNodeList = fileNodeList;
    }

    public List<FileNode> getFileNodeList() {
        return fileNodeList;
    }
}
