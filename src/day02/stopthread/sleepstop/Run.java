package day02.stopthread.sleepstop;

/**
 * @author XieKong
 * @date 2019/6/4 16:18
 * 如果在sleep状态下停止某一线程，会进入catch语句，并清除停止状态值，使之变为false
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(200);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
