package day08.condition.waitnotify;

/**
 * @author XieKong
 * @date 2019/6/17 17:36
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();

        Thread.sleep(3000);

        service.signal();
    }
}
