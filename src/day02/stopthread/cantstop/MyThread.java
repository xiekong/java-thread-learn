package day02.stopthread.cantstop;

/**
 * @author XieKong
 * @date 2019/6/4 16:19
 */
public class MyThread extends Thread {
    @Override
    synchronized public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("i: " + (i + 1));
        }
    }
}
