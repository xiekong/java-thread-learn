package day09.readwritelock;

/**
 * @author XieKong
 * @date 2019/6/18 10:05
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
