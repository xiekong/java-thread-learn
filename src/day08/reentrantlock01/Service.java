package day08.reentrantlock01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author XieKong
 * @date 2019/6/17 17:24
 */
public class Service {
    private Lock lock = new ReentrantLock();

    public void test() {
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("thread name " + Thread.currentThread().getName() + " i=" + i);
        }
        lock.unlock();
    }
}
