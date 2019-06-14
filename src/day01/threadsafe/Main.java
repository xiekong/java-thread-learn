package day01.threadsafe;

/**
 * @author XieKong
 * @date 2019/6/3 19:03
 */
public class Main {
    public static void main(String[] args) {
//        ALogin a = new ALogin();
//        a.start();
//        BLogin b = new BLogin();
//        b.start();

        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread);
        Thread b = new Thread(myThread);
        Thread c = new Thread(myThread);
        Thread d = new Thread(myThread);
        Thread e = new Thread(myThread);

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
