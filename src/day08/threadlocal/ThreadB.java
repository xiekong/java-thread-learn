package day08.threadlocal;

/**
 * @author XieKong
 * @date 2019/6/17 14:12
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Tools.threadLocalValue.set("ThreadB " + i);
                System.out.println("ThreadB get " + Tools.threadLocalValue.get());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
