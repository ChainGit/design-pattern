package com.chain.learn.design.pattern.composite;

public class PrintFileNode extends FileNode {

    private int level;
    private boolean isLast;

    public PrintFileNode() {
    }

    public PrintFileNode(String name, int level, boolean isLast) {
        super(name);
        this.level = level;
        this.isLast = isLast;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isLast() {
        return isLast;
    }

    public void setLast(boolean last) {
        isLast = last;
    }

    public static PrintFileNode of(FileNode fileNode, int level, boolean isLast) {
        if (fileNode == null) {
            throw new RuntimeException("file node is null");
        }
        PrintFileNode pfnode = new PrintFileNode(fileNode.getName(), level, isLast);
        pfnode.setFileNodeList(fileNode.getFileNodeList());
        return pfnode;
    }
}