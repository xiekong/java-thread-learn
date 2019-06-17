package day08.condition02.notifyall;

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

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA time " + System.currentTimeMillis() + " thread name " + Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitA time " + System.currentTimeMillis() + " thread name " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB time " + System.currentTimeMillis() + " thread name " + Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitB time " + System.currentTimeMillis() + " thread name " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll() {
        try {
            lock.lock();
            condition.signalAll();
            System.out.println("signalAll 时间 " + System.currentTimeMillis() + " thread name " + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
}
