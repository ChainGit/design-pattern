package com.chain.learn.design.pattern.composite;

import org.apache.commons.collections4.CollectionUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author bangquan.qian
 * @Date 2018/11/21 4:20 PM
 */

public class FileNodePrinter {

    private static final String NL = System.getProperty("line.separator", "\n");

    public static void print(FileNode fileNode, OutputStream os) throws IOException {
        if (fileNode == null || os == null) {
            throw new RuntimeException("resource is null");
        }

        Queue<FileNode> queue = new LinkedList<>();

        Deque<FileNode> stack = new LinkedList<>();
        stack.push(PrintFileNode.of(fileNode, 0, true));

        while (stack.size() > 0) {
            PrintFileNode pnode = (PrintFileNode) stack.pop();
            queue.offer(pnode);

            List<FileNode> cnodeList = pnode.getFileNodeList();
            if (CollectionUtils.isEmpty(cnodeList)) {
                continue;
            }

            int childLevel = pnode.getLevel() + 1;
            int cnodeListSize = cnodeList.size();
            for (int idx = cnodeListSize - 1; idx > -1; idx--) {
                stack.push(PrintFileNode.of(cnodeList.get(idx), childLevel, idx == cnodeListSize - 1));
            }
        }

        print2Os(queue, os);
    }

    private static void print2Os(Queue<FileNode> queue, OutputStream os) throws IOException {
        StringBuilder sb = new StringBuilder();
        FileNode[] nodes = queue.toArray(new FileNode[0]);
        int size = nodes.length;
        for (int idx = 0; idx < size; idx++) {
            PrintFileNode pnode = (PrintFileNode) nodes[idx];
            for (int ydx = 0; ydx < pnode.getLevel(); ydx++) {
                sb.append("|").append("\t");
            }
            sb.append(pnode.isLast() ? "└" : "├");
            sb.append(" ").append(pnode.getName()).append(NL);
        }

        os.write(sb.toString().getBytes());
        os.flush();
    }

}
