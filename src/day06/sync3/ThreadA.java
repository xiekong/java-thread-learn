package day06.sync3;

/**
 * @author XieKong
 * @date 2019/6/13 15:46
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.a();
    }
}
