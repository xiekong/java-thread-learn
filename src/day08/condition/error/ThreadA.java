package day08.condition.error;

/**
 * @author XieKong
 * @date 2019/6/17 17:35
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
