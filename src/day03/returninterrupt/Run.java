package day03.returninterrupt;

/**
 * @author XieKong
 * @date 2019/6/4 16:18
 * interrupt()与return结合停止线程
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
