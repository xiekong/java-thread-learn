package day01.sharedata;

/**
 * @author XieKong
 * @date 2019/6/3 18:39
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "a");
        Thread b = new Thread(myThread, "b");
        Thread c = new Thread(myThread, "c");
        Thread d = new Thread(myThread, "d");
        Thread e = new Thread(myThread, "e");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
