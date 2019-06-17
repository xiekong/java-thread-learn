package day08.waitreleaselock;

/**
 * @author XieKong
 * @date 2019/6/17 11:01
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("开始等待 " + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束等待 " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
