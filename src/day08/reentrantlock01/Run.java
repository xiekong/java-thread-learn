package day08.reentrantlock01;

/**
 * @author XieKong
 * @date 2019/6/17 17:26
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();

        MyThread t1 = new MyThread(service);
        t1.setName("t1");
        MyThread t2 = new MyThread(service);
        t2.setName("t2");
        MyThread t3 = new MyThread(service);
        t3.setName("t3");
        MyThread t4 = new MyThread(service);
        t4.setName("t4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
