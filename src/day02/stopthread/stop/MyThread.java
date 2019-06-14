package day02.stopthread.stop;

/**
 * @author XieKong
 * @date 2019/6/4 16:19
 */
public class MyThread extends Thread {
    @Override
    synchronized public void run() {
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println("已经是停止状态了，退出");
                break;
            }
            System.out.println("i: " + (i + 1));
        }
        System.out.println("线程并未停止");
    }
}
