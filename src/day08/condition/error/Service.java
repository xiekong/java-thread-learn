package day08.condition.error;

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
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
