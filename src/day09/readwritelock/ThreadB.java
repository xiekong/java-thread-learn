package day09.readwritelock;

/**
 * @author XieKong
 * @date 2019/6/18 10:05
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
