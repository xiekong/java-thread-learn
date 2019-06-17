package day08.condition02.notifyany;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author XieKong
 * @date 2019/6/17 17:33
 */
public class Service {
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA time " + System.currentTimeMillis() + " thread name " + Thread.currentThread().getName());
            conditionA.await();
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
            conditionB.await();
            System.out.println("end awaitB time " + System.currentTimeMillis() + " thread name " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_A() {
        try {
            lock.lock();
            conditionA.signalAll();
            System.out.println("signalAll A 时间 " + System.currentTimeMillis() + " thread name " + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_B() {
        try {
            lock.lock();
            conditionB.signalAll();
            System.out.println("signalAll B 时间 " + System.currentTimeMillis() + " thread name " + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
}
