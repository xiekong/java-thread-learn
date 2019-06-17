package day08.condition02.notifyall;


/**
 * @author XieKong
 * @date 2019/6/17 17:36
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();

        Thread.sleep(3000);

        service.signalAll();
    }
}
