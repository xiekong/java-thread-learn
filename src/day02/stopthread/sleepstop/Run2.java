package day02.stopthread.sleepstop;

/**
 * @author XieKong
 * @date 2019/6/4 16:18
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
        myThread.start();
        myThread.interrupt();
        System.out.println("end");
    }
}
