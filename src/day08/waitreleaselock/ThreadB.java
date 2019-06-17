package day08.waitreleaselock;

/**
 * @author XieKong
 * @date 2019/6/17 10:27
 */
public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
