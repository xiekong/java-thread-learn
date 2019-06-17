package day08.reentrantlock01;

/**
 * @author XieKong
 * @date 2019/6/17 17:26
 */
public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.test();
    }
}
