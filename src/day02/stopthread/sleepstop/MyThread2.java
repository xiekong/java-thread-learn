package day02.stopthread.sleepstop;

/**
 * @author XieKong
 * @date 2019/6/4 16:19
 */
public class MyThread2 extends Thread {
    @Override
    synchronized public void run() {
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("i=" + (i + 1));
            }
            System.out.println("run begin");
            Thread.sleep(20000000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止在遇到sleep，进入catch");
            e.printStackTrace();
        }
    }
}
