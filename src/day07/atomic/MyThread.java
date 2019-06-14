package day07.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author XieKong
 * @date 2019/6/14 17:44
 */
public class MyThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    // 原子类在具有逻辑的情况下也是非线程安全的
    private synchronized void addCount() {
        for (int i = 0; i < 100; i++) {
            count.set(count.get() + 1);
        }
        System.out.println("count=" + count);
    }



    @Override
    public void run() {
        addCount();
    }
}
