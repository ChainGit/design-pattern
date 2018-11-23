package com.chain.learn.design.pattern.composite;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2018/11/21 5:51 PM
 */

public class CompositePatternTest {

    @Test
    public void test() throws Exception {
        FileNode a = new FileNode("a");

        FileNode b1 = new FileNode("b1");
        FileNode b2 = new FileNode("b2");
        FileNode b3 = new FileNode("b3");
        FileNode b4 = new FileNode("b4");
        FileNode b5 = new FileNode("b5");

        FileNode c1 = new FileNode("c1");
        FileNode c2 = new FileNode("c2");
        FileNode c3 = new FileNode("c3");
        FileNode c4 = new FileNode("c4");
        FileNode c5 = new FileNode("c5");

        FileNode d1 = new FileNode("d1");
        FileNode d2 = new FileNode("d2");
        FileNode d3 = new FileNode("d3");
        FileNode d4 = new FileNode("d4");
        FileNode d5 = new FileNode("d5");

        FileNode e1 = new FileNode("e1");
        FileNode e2 = new FileNode("e2");
        FileNode e3 = new FileNode("e3");
        FileNode e4 = new FileNode("e4");

        a.addNode(b1);
        a.addNode(b2);
        a.addNode(b3);
        a.addNode(b4);
        a.addNode(b5);

        b1.addNode(c1);
        b1.addNode(c2);
        b3.addNode(c3);
        b4.addNode(c4);
        b4.addNode(c5);

        d1.addNode(e1);
        d1.addNode(e2);
        d4.addNode(e3);
        d4.addNode(e4);

        c1.addNode(d1);
        c3.addNode(d4);

        c5.addNode(d2);
        c5.addNode(d3);
        c5.addNode(d5);

        FileNodePrinter.print(a, System.out);
    }
}
