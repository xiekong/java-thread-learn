package day02.stopthread.stop;

/**
 * @author XieKong
 * @date 2019/6/4 16:19
 */
public class MyThread2 extends Thread {
    @Override
    synchronized public void run() {
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println("已经是停止状态了，退出");
                    throw new InterruptedException();
                }
                System.out.println("i: " + (i + 1));
            }
            System.out.println("线程并未停止");
            System.out.println("线程并未停止");
            System.out.println("线程并未停止");
        } catch (InterruptedException e) {
            System.out.println("进入MyThread2的catch了");
            e.printStackTrace();
        }
    }
}
