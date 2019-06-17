package day08.condition02.producerandconsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author XieKong
 * @date 2019/6/17 11:16
 */
public class ValueObject {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
//    private boolean hasValue = false;
    private String value = "";

//    public void getValue() {
//        try {
//            lock.lock();
//            while (!hasValue) {
//                condition.await();
//            }
//            hasValue = false;
//            System.out.println("thread name " + Thread.currentThread().getName() +" get value");
//            condition.signal();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            lock.unlock();
//        }
//    }

    public void getValue() {
        try {
            lock.lock();
            while (this.value.equals("")) {
                condition.await();
            }
            System.out.println("thread name " + Thread.currentThread().getName() +" get value " + this.value);
            this.value = "";
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

//    public void setValue() {
//        try {
//            lock.lock();
//            while (hasValue) {
//                condition.await();
//            }
//            hasValue = true;
//            System.out.println("thread name " + Thread.currentThread().getName() +" set value");
//            condition.signal();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            lock.unlock();
//        }
//    }

    public void setValue() {
        try {
            lock.lock();
            while (!this.value.equals("")) {
                condition.await();
            }
            this.value =  System.currentTimeMillis() + "_" + System.nanoTime();
            System.out.println("thread name " + Thread.currentThread().getName() +" set value " + this.value);
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
