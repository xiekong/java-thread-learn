package day08.condition02.notifyany;

/**
 * @author XieKong
 * @date 2019/6/17 17:35
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
