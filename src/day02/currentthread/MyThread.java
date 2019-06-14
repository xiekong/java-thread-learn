package day02.currentthread;

/**
 * @author XieKong
 * @date 2019/6/4 16:19
 */
public class MyThread extends Thread {

    public MyThread() {
        System.out.println("constructor print: " + Thread.currentThread().getName());
    }

    @Override
    synchronized public void run() {
        System.out.println("run method print: " + Thread.currentThread().getName());
    }
}
