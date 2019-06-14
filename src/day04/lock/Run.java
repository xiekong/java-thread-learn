package day04.lock;

/**
 * @author XieKong
 * @date 2019/6/6 18:04
 * 多个对象多个锁
 * 关键字synchronized取得的都是对象锁，而不是把一段代码或者方法当作锁
 * 哪个线程先执行带synchronized的方法，哪个线程就持有该方法所属对象的
 * 锁，那么其他线程只能呈等待状态（前提，多个线程访问同一个对象），如果
 * 多个线程访问多个对象，则JVM会创建多个锁
 */
public class Run {
    public static void main(String[] args) {
        // 两个对象，两个锁
        HasSelfPrivateNum selfPrivateNum1 = new HasSelfPrivateNum();
        HasSelfPrivateNum selfPrivateNum2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(selfPrivateNum1);
        threadA.start();
        ThreadB threadB = new ThreadB(selfPrivateNum2);
        threadB.start();
    }
}
