package day08.condition.waitnotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author XieKong
 * @date 2019/6/17 17:33
 */
public class Service {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            System.out.println("await 时间 " + System.currentTimeMillis());
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("锁释放了");
        }
    }

    public void signal() {
        try {
            lock.lock();
            condition.signal();
            System.out.println("signal 时间 " + System.currentTimeMillis());
        } finally {
            lock.unlock();
        }
    }
}
