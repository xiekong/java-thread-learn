package day08.condition.correct;

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
            System.out.println("A");
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("锁释放了");
        }
    }
}
