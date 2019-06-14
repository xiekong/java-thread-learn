package day02.stopthread.sleepstop;

/**
 * @author XieKong
 * @date 2019/6/4 16:19
 */
public class MyThread extends Thread {
    @Override
    synchronized public void run() {
        try {
            System.out.println("run begin");
            Thread.sleep(20000000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中停止，进入catch，" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
