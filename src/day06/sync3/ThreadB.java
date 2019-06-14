package day06.sync3;


/**
 * @author XieKong
 * @date 2019/6/13 15:46
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.b();
    }
}
