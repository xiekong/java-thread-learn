package day09.fair;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author XieKong
 * @date 2019/6/18 9:34
 */
public class Service {
    private Lock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void testMethod() {
        try {
            lock.lock();
            System.out.println("thread name " + Thread.currentThread().getName() + " get lock");
        } finally {
            lock.unlock();
        }
    }
}
