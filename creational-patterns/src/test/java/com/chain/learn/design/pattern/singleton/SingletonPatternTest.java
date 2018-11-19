package com.chain.learn.design.pattern.singleton;

import com.chain.learn.design.pattern.common.utils.PrintUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Author bangquan.qian
 * @Date 2018/11/19 10:57 AM
 */

public class SingletonPatternTest {


    @Test
    public void test() throws Exception {
        doTest(SingletonMode.HUNGRY);
        doTest(SingletonMode.LAZY);
        doTest(SingletonMode.SAFE_LAZY);
        doTest(SingletonMode.STATIC);
        doTest(SingletonMode.ENUM);
    }

    private void doTest(int type) throws Exception {
        CountDownLatch latch = new CountDownLatch(1);
        List<SingletonTestThread> threadList = getThreadList(100, type, latch);
        for (Thread thread : threadList) {
            thread.start();
        }

        latch.countDown();

        for (Thread thread : threadList) {
            thread.join();
        }

        PrintUtils.println("============================");
        TimeUnit.SECONDS.sleep(3);
    }

    private List<SingletonTestThread> getThreadList(int num, int type, CountDownLatch latch) {
        List<SingletonTestThread> threadList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            threadList.add(new SingletonTestThread(type, latch));
        }
        return threadList;
    }
}

interface SingletonMode {
    int HUNGRY = 0;
    int LAZY = 1;
    int SAFE_LAZY = 2;
    int STATIC = 3;
    int ENUM = 4;
}

class SingletonTestThread extends Thread {

    private CountDownLatch latch;
    private int type;

    public SingletonTestThread(int type, CountDownLatch latch) {
        this.type = type;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            PrintUtils.println(e);
        }

        super.run();

        if (type == SingletonMode.ENUM) {
            EnumSingleton.getInstance().show();
            return;
        }

        switch (type) {
            case SingletonMode.HUNGRY:
                HungrySingleton.getInstance().show();
                break;
            case SingletonMode.LAZY:
                LazySingleton.getInstance().show();
                break;
            case SingletonMode.SAFE_LAZY:
                ThreadSafeLazySingleton.getInstance().show();
                break;
            case SingletonMode.STATIC:
                StaticInnerClassSingleton.getInstance().show();
                break;
        }
    }
}
